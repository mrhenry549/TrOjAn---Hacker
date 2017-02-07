package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class RecieveArray {
    public String array;

    public RecieveArray() {
        try {

            Socket sock = new Socket("192.168.250.158", 80);
            
            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "filelist";
            dout.writeUTF(msgout);
            dout.flush();

            DataInputStream din = new DataInputStream(sock.getInputStream());
            array = din.readUTF();

        } catch (Exception e) {

        }
    }
}