package network;

import java.io.*;
import java.net.*;

public class ServerChat {

    private final int PORTO = 80;

    public ServerChat() {

        try {
            ServerSocket ssoc = new ServerSocket(PORTO);
            Socket sock = ssoc.accept();

            DataInputStream din = new DataInputStream(sock.getInputStream());
            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            String msgin = "", msgout = "";
            
            msgout = "takepic";
            dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }

}
