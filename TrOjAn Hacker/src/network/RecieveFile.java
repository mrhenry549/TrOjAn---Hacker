/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveFile {
    public RecieveFile() throws IOException {

        RecieveNome rn = new RecieveNome();
        
        try {

            Socket sock = new Socket("192.168.250.158", 80);
            byte[] bytearray = new byte[65123442];
            InputStream is = sock.getInputStream();
            FileOutputStream fos = new FileOutputStream("D:/"+rn.getRead());
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int bytesread = is.read(bytearray, 0, bytearray.length);

            bos.write(bytearray, 0, bytesread);

            bos.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
