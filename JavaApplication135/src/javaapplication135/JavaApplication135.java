package javaapplication135;

import java.util.HashSet;
import java.util.Iterator;

public class JavaApplication135 {
    public static void main(String[] args) {
        System.out.println("************ HashSet **************");
        HashSet users_set = new HashSet();
        users_set.add("Peter");
        users_set.add("Sally");
        users_set.add("Peter");
        Iterator iter = users_set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        for (Object user : users_set) {
            System.out.println(user);            
        }
    }
    
}
