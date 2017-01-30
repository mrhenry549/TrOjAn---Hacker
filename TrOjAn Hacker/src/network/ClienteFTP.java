package network;

import java.io.DataInputStream;
import java.net.Socket;

public class ClienteFTP {
    private final int PORTO = 80;
    private final String IP = "192.168.250.250";
    public String msgin = "";

    public ClienteFTP() {
        try {

            Socket sock = new Socket(IP, PORTO);

            DataInputStream din = new DataInputStream(sock.getInputStream());

            msgin = din.readUTF(); 

        } catch (Exception e) {

        }
    }
}
