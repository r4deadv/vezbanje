package datastreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("testfile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeInt(10);
        dos.writeFloat(15.5f);
        dos.writeInt(65);
        dos.close();
        
        //FileInputStream fis = new FileInputStream("testfile.txt");
        //BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("testfile.txt")));
        //rucno citanje iz strima
        System.out.println(dis.readInt());
        System.out.println(dis.readFloat());
        System.out.println(dis.readInt());
        
        //automatsko citanje iz strima
        try {
            while(true){
                System.out.println(dis.readInt());
            }
        } catch (EOFException e) {
            System.out.println("Stream reading finished");
        } finally{
            dis.close();
        }
    }
    
}
