package network;

import java.io.DataOutputStream;
import java.net.Socket;

public class SendNum {

    public SendNum(int ftpNum) {
        
        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            dout.write(ftpNum);
            dout.flush();

        } catch (Exception e) {

        }
        
    }
}
