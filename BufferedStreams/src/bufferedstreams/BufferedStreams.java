package bufferedstreams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreams {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("testfile.txt"));
        bw.write("Hello");
        bw.flush();
        Thread.sleep(500);
        bw.write("World");
        bw.close();
        
        BufferedReader br = new BufferedReader(new FileReader("testfile.txt"));
        String line;
        while((line=br.readLine())!=null)
            System.out.println(line);
    }
    
}
