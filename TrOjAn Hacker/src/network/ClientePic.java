package network;

import java.io.*;
import java.net.*;

public class ClientePic {

    public ClientePic() throws IOException {

        try {

            Socket sock = new Socket("192.168.250.158", 80);
            byte[] bytearray = new byte[65123442];
            InputStream is = sock.getInputStream();
            FileOutputStream fos = new FileOutputStream("D:/Screenshot.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int bytesread = is.read(bytearray, 0, bytearray.length);

            bos.write(bytearray, 0, bytesread); //talvez aqui

            bos.close();
            //sock.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }

}