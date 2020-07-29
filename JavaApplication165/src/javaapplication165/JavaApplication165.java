package javaapplication165;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication165 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //FileReader fr = new FileReader("heroes");
        BufferedReader bfr = new BufferedReader(new FileReader("heroes"));
        String line;
        while((line=bfr.readLine())!=null){
            //System.out.println(line);
            String[] razdvojeno = line.split("\\|");
            System.out.println("Hero id: " + razdvojeno[0].split(":")[1]);
            System.out.println("Hero name: " + razdvojeno[1].split(":")[1]);
            System.out.println("Hero speed: " + razdvojeno[2].split(":")[1]);
            System.out.println("--------------------------------");
        }
    }
}
