/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class RecieveNome {
    private final int PORTO = 80;
    private final String IP = "192.168.250.250";
    DataInputStream din;

    public RecieveNome() {
        try {

            Socket sock = new Socket(IP, PORTO);

            DataInputStream din = new DataInputStream(sock.getInputStream());

        } catch (Exception e) {

        }
        
    }
    public String getRead() throws IOException {
         return din.readUTF();
    }
}