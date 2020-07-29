package javaapplication106;

import java.util.ArrayList;

public class JavaApplication106 {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        lista.add(new User("Vladimir"));
        lista.add(new User("Maric"));
        
        for (Object o : lista) {
            User u = (User)o;
            System.out.println(u.name);
        }
        
        ArrayList<User> list = new ArrayList();
        list.add(new User("Rade"));
        list.add(new User("Mihovilovic"));
        
        for (User user : list) {
            System.out.println(user.name);
        }
    }
    
}
