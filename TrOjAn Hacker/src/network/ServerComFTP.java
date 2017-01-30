package network;

import java.io.*;
import java.net.*;

public class ServerComFTP {

    private final int PORTO = 80;

    public ServerComFTP() {

        try {
            ServerSocket ssoc = new ServerSocket(PORTO);
            Socket sock = ssoc.accept();

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "";
            dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }

}
