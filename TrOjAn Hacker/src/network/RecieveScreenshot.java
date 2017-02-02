package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class RecieveScreenshot {

    Socket ClientSock;
    DataOutputStream output;
    DataInputStream input;
    String msg = "pic";

    public RecieveScreenshot() throws IOException {

        File fil = new File("ScreenShot.jpg");
        try {

            ClientSock = new Socket("192.168.250.121", 80);
            input = new DataInputStream(ClientSock.getInputStream());
            output = new DataOutputStream(ClientSock.getOutputStream());

            output.writeUTF(msg);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        FileOutputStream fos = new FileOutputStream(fil);
        int i;
        String temp;
        do {
            temp = input.readUTF();
            i = Integer.parseInt(temp);
            if (i != -1) {
                fos.write(i);
            }
        } while (i != -1);
        fos.close();

    }

}
