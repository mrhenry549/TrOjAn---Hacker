package network;

import java.io.*;
import java.net.*;

public class SendComFTP {

    private final int PORTO = 80;

    public SendComFTP() {

        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "filelist";
            dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }
    

}
