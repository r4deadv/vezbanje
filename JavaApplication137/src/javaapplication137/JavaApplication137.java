package javaapplication137;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaApplication137 {
    public static void main(String[] args) {
        
        ArrayList t = new ArrayList();
//        Tacke a = new Tacke();
//        a.x=10;
//        a.y=10;
//        Tacke b = new Tacke();
//        b.x=15;
//        b.y=20;
//        t.add(a);
//        t.add(b);
        t.add(new Tacke(10, 20));
        t.add(new Tacke(5, 10));
        t.add(new Tacke(3, 2));
        t.add(new Tacke(15, 25));
        t.add(new Tacke(15, 40));
        
        //System.out.println(t);
        Bounds bounds = new Bounds(5, 0, 25, 40);
        
        for (Object object : t) {
            System.out.println(((Tacke)object).x);
       }
        
        for(int i=0; i<t.size(); i++){
            if( (bounds.x + bounds.width) >= ((Tacke)t.get(i)).x &&
                ((Tacke)t.get(i)).x > bounds.x &&
                (bounds.y + bounds.height) >= ((Tacke)t.get(i)).y &&
                ((Tacke)t.get(i)).y > bounds.y
                ){
                System.out.println("Tacka je u zoni " + ((Tacke)t.get(i)));
            }else {
                System.out.println("Tacka nije u zoni " + ((Tacke)t.get(i)));
            }
        }
       
    }
    
}
