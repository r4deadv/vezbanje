package mergefiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("treciFajl.txt"));
        
        BufferedReader br1 = new BufferedReader(new FileReader("prviFajl.txt"));
        String prvi;
        while((prvi=br1.readLine())!=null){
            //System.out.println(prvi);
            bw.write(prvi);
            bw.newLine();
            bw.flush();
        }
        
        BufferedReader br2 = new BufferedReader(new FileReader("drugiFajl.txt"));
        String drugi;
        while((drugi=br2.readLine())!=null){
            //System.out.println(drugi);
            bw.write(drugi);
            bw.newLine();
            bw.flush();
        }
        br1.close();
        br2.close();
        bw.close();
    }
    
}
