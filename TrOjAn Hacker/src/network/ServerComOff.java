package network;

import java.io.*;
import java.net.*;

public class ServerComOff {

    private final int PORTO = 80;

    public ServerComOff() {

        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            String msgout = "off";
            dout.writeUTF(msgout);
            dout.flush();
            dout.close();

        } catch (Exception e) {

        }

    }

}
