package network;

import java.io.*;
import java.net.*;

public class ServerComOff {

    private final int PORTO = 80;

    public ServerComOff() {

        try {
            ServerSocket ssoc = new ServerSocket(PORTO);
            Socket sock = ssoc.accept();

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "off";
            dout.writeUTF(msgout);
            dout.flush();
            dout.close();

        } catch (Exception e) {

        }

    }

}
