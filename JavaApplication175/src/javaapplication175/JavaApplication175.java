package javaapplication175;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaApplication175 {
    public static void main(String[] args) throws IOException {
        InputStream cesma;
        OutputStream slivnik;
        cesma = new FileInputStream("C:/Users/Rade/Downloads/Svasta/E5Sq9G.jpg");
        
//        while(true){
//            int kap = cesma.read();
//            if(kap==-1){
//                break;
//            }
//            System.out.print(kap);
//        }
        slivnik = new FileOutputStream("slika.jpg");
        int kap;
        int count = 0;
        while((kap=cesma.read())!=-1){
            slivnik.write(kap);
            System.out.print(kap);
            count++;
        }
        System.out.println("Broj karaktera je " + count);
//        slivnik.write('9');
//        slivnik.write(49);
//        slivnik.write('0');
    }
    
}
