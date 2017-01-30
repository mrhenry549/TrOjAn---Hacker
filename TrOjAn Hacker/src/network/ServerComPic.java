package network;

import java.io.*;
import java.net.*;
import trojan.hacker.TrOjAnHacker;

public class ServerComPic {

    private final int PORTO = 80;

    public ServerComPic() {

        try {
            ServerSocket ssoc = new ServerSocket(PORTO);
            Socket sock = ssoc.accept();

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
            //String msgout = TrOjAnHacker.ftpNum;
            //dout.writeUTF(msgout);
            dout.flush();

        } catch (Exception e) {

        }

    }

}
