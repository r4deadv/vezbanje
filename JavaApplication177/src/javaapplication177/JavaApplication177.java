package javaapplication177;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JavaApplication177 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader r = new BufferedReader(new FileReader("word.txt"));
        int b;
        int count = 0;
        int space = 0;
        while((b=r.read())!=-1){
            System.out.print((char)b);
            count++;
            if(b==32){
                space++;
            }
        }
        
        System.out.println("\n\nUkupno karaktera: " + count);
        System.out.println("Karakteri bez spejsa: " +(count-space));
        System.out.println("Broj reci: " + (space+1));
    }
    
}
