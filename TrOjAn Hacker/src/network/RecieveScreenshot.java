package network;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveScreenshot {

    Socket sock;
    DataOutputStream output;
    DataInputStream input;
    byte[] bytearray = new byte[65123442];
    int bytesread = 0;

    public RecieveScreenshot() throws IOException {

            sock = new Socket("192.168.250.158", 80);
            input = new DataInputStream(sock.getInputStream());
            output = new DataOutputStream(sock.getOutputStream());
            output.writeUTF("takepic");
                byte[] bytearray = new byte[65123442];
                InputStream is = sock.getInputStream();
                FileOutputStream fos = new FileOutputStream("D:/screenshot.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                int bytesread = is.read(bytearray, 0, bytearray.length);

                bos.write(bytearray, 0, bytesread);

                bos.close();

    }

}
