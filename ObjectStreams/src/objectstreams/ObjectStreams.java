package objectstreams;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("gamestate.txt")));
        PlayerPosition pp = new PlayerPosition(11, 25);
        oos.writeObject(pp);
        oos.close();
        
        FileInputStream fis = new FileInputStream("gamestate.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        PlayerPosition pt_deserialized = (PlayerPosition)ois.readObject();
        ois.close();
        System.out.println(pt_deserialized.x);
        System.out.println(pt_deserialized.y);
    }
    
}
