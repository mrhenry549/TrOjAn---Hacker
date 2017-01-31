package network;

import java.io.*;
import java.net.*;

public class ServerComPic {

    private final int PORTO = 80;

    public ServerComPic() {

        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
            String msgout = "takepic";
            
            dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }

}
