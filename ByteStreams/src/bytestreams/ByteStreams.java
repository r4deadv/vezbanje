package bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("testfile.txt");
        fos.write(104);
        fos.write(101);
        fos.write(108);
        fos.write(108);
        fos.write(111);
        fos.flush();
        fos.close();
        
        FileInputStream fis = new FileInputStream("testfile.txt");

        int b;
        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
    
}
