/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class RecieveArray {
    private final int PORTO = 80;
    private final String IP = "192.168.250.250";
    public String msgin = "";
    DataInputStream din;
    public String array;

    public RecieveArray() {
        try {

            Socket sock = new Socket(IP, PORTO);

            din = new DataInputStream(sock.getInputStream());
            
            din.readUTF();
            
            array = din.readUTF();

        } catch (Exception e) {

        }
    }
}