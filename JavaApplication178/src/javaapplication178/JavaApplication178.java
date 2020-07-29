package javaapplication178;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class JavaApplication178 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.it-akademija.com", 80);
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();
        os.write("GET /cms/mestoZaUploadFajlove/predlog-1_03_.jpg HTTP/1.1\r\nHost: www.it-akademija.com\r\nConnection: close\r\n\r\n".getBytes());
        int bajt;
        while((bajt=is.read())!=-1){
            System.out.print((char)bajt);
        }
    }
    
}
