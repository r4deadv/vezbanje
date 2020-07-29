package mergefiles2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream[] streams = {
            new FileInputStream("prvifajl.txt"),
            new FileInputStream("drugifajl.txt")
        };
        FileOutputStream fos = new FileOutputStream("trecifalj.txt");
        int b;
        for(int i=0; i<streams.length; i++){
            while((b=streams[i].read())!=-1){
                fos.write(b);
            }
            streams[i].close();
        }
        fos.close();
    }
    
}
