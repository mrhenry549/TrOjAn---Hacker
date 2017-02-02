/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveFile {
        
    Socket sock = new Socket("192.168.250.158", 80);
    
    public RecieveFile() throws IOException {

        String nomeFicheiro = "";
        
        try {

            byte[] bytearray = new byte[65123442];
            InputStream is = sock.getInputStream();
            RecieveNome(nomeFicheiro);
            FileOutputStream fos = new FileOutputStream("D:/"+nomeFicheiro);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int bytesread = is.read(bytearray, 0, bytearray.length);

            bos.write(bytearray, 0, bytesread);

            bos.close();

        } catch (Exception e) {
            System.out.print(e);
            
        }

    }
    
    private String RecieveNome(String nome) throws IOException{
        DataInputStream din = new DataInputStream(sock.getInputStream());
            
        nome = din.readUTF();
        
        return nome;
    }
}
