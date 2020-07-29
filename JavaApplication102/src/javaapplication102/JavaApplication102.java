package javaapplication102;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaApplication102 {
    public static void main(String[] args) {
        
        RadeProbaInterfejs rpi = new RadeProbaInterfejs() {
            @Override
            public void f() {
                System.out.println("Hello");
            }
        };
        rpi.f();
        
        RadeKlasa rk1 = new RadeKlasa();
        Iterator iter = rk1.iterator();
        iter.hasNext();
        iter.next();
        
//        implementacija i instanciranje liste - inicijalizator klasa
        List l = new ArrayList(){
            {
                add("Cao!");
                add("Kaako si?");
            }
        };
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        
//        primeri za iterator
//        List heroes = new ArrayList();
//        heroes.add("Soraka");
//        heroes.add("Ziggs");
//        heroes.add("Vayne");
//        
//        RadeKlasa rk = new RadeKlasa();
//        for (Object o : rk) {
//            System.out.println(o);
//        }
//        Iterator iter = heroes.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//        System.out.println(iter.hasNext());
        
//        for (Object h : heroes) {
//            System.out.println(h);  
//        }
//        
        
    }
    
}
