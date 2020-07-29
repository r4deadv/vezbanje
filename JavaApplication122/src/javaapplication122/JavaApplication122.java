package javaapplication122;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaApplication122 {
    public static void main(String[] args) {
        List heroes = new ArrayList();
        heroes.add("Soraka");
        heroes.add("Ziggs");
        heroes.add("Vayne");
        
        Iterator iter = heroes.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
        RadeProbaInterfejs rpi = new RadeProbaInterfejs() {
            @Override
            public void f() {
                System.out.println("metod f");
            }
        };
        rpi.f();
        
        List lista = new ArrayList(){
            {
                add("Prvi");
                add("Broj");
                add("je");
                add(10);
            }
            };
        lista.add(20);
        for (Object object : lista) {
            System.out.println(object);
        }
        
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
        RadeKlasa rk = new RadeKlasa();
        for (Object o : rk) {
            System.out.println(o);
        }
    }
    
}
