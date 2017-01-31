/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author UserPL022Pc15
 */
public class SendNum {
    private final int PORTO = 80;

    public SendNum(String ftpNum) {
        
        try {
            Socket sock = new Socket("192.168.250.158", 80);

            DataOutputStream dout = new DataOutputStream(sock.getOutputStream());

            dout.writeUTF(ftpNum);
            dout.flush();

        } catch (Exception e) {

        }
        
    }
}
