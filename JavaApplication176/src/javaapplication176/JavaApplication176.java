package javaapplication176;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class JavaApplication176 {
    public static void main(String[] args) throws IOException {
        Writer wr;
        wr = new FileWriter("izlaz.txt");
        wr.write("Cao kako si?");
        wr.write("nesto drugo");
        wr.flush();
        
        InputStream is = new FileInputStream("pozicije.txt");
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        String linija;
        while((linija=br.readLine())!=null){
        System.out.println(linija);
        }
        
        BufferedWriter bw = new BufferedWriter(wr);
        bw.write("Cao, ja sam kao baferovani pisac");
        bw.flush();
        
//        Reader r = new FileReader("pozicije.txt");
//        char[] karakteri = new char[32];
//        r.read(karakteri);
//        System.out.println(karakteri);
//
//        BufferedReader br = new BufferedReader(r);
//        System.out.println(br.readLine());
        
    }
    
}
