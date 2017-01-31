package network;

import java.io.*;
import java.net.*;

public class ServerComFTP {

    private final int PORTO = 80;

    public ServerComFTP() {

        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "ftp";
            dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }

}
