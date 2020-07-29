package javaapplication164;

import java.io.*;
import java.util.Scanner;

public class JavaApplication164 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Rade/Desktop/Crtani.txt"));
        Brod b = (Brod)ois.readObject();
        System.out.println("X: " + b.x + " , y: " + b.y);
        
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Rade/Desktop/Crtani.txt"));
//        Brod b = new Brod();
//        b.x = 150;
//        b.y = 250;
//        oos.writeObject(b);
        
//        InputStream cis = new FileInputStream("C:/Users/Rade/Desktop/Filmovi.txt");
//        int broj;
//        while((broj=cis.read())!=-1){
//            System.out.print(broj);
//        }
//        OutputStream cos = new FileOutputStream("C:/Users/Rade/Desktop/Crtani.txt");
//        char slovo = 'R';
//        cos.write(slovo);
//        cos.write('A');
//        cos.write('D');
//        cos.write('E');
//        InputStream fis = new FileInputStream("C:/Users/Rade/Desktop/Filmovi.txt");
//        Scanner s = new Scanner(fis);
//        System.out.println(s.nextLine());
//        System.out.println(s.nextLine());
//          int broj;
//          while((broj=fis.read())!=-1){
//              System.out.print((char)broj);
//          }
          Reader rdr = new FileReader("C:/Users/Rade/Desktop/Filmovi.txt");
          BufferedReader br = new BufferedReader(rdr);
          
          String line;
          while((line=br.readLine())!=null){
              System.out.println(line);
          }
          //objekat File
//          File f = new File("C:/Users/Rade/Downloads");
//          System.out.println(f.listFiles());
//          Writer wr = new FileWriter("C:/Users/Rade/Desktop/Crtani.txt", true);
//          wr.write("Dusko Dugousko");
//          wr.write("Tom i Dzeri");
//          
//          wr.flush();
//          wr.write("Saut Park");
//
//          wr.close();
//          
//          DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Users/Rade/Desktop/Dos.txt"));
//          dos.writeInt(150);
//          dos.writeUTF("Hello world");
//          dos.writeDouble(150.4);
//          dos.close();
//          
//          DataInputStream dis = new DataInputStream(new FileInputStream("C:/Users/Rade/Desktop/Dos.txt"));
//          int broj = dis.readInt();
//          String tekst = dis.readUTF();
//          double decimal = dis.readDouble();
//          System.out.println("Broj je " + broj);
//          System.out.println("Tekst je " + tekst);
//          System.out.println("Decimal je " + decimal);
//          System.out.println(br.readLine());
//          System.out.println(br.readLine());
//          System.out.println(br.readLine());
//          System.out.println(br.readLine());
//          char[] tekst = new char[64];
//          rdr.read(tekst);
//          System.out.println(tekst);
//          rdr.read(tekst);
//          System.out.println(tekst);
    }
    
}
