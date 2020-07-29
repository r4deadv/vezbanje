package characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("testfile.txt");
        fw.write("Hello World");
        fw.close();
        
        FileReader fr = new FileReader("testfile.txt");
        int b;
        while((b=fr.read())!=-1){
            System.out.print((char)b);
        }
        fr.close();
    }
    
}
