package javaapplication84;

import java.util.*;

public class JavaApplication84 {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[1] = 50;
        System.out.println("Value on position 1 is " + x[1]);
        System.out.println(x);
        System.out.println(Arrays.toString(x));
        
        Object[] y = new Object[3];
        y[0] = 10;
        y[1] = "Hallo";
        NewClass nc = new NewClass();
        y[2] = nc;
        System.out.println(Arrays.toString(y));
        
        NewClass izvucenObjekat = (NewClass)y[2];
        Object o = (Object)izvucenObjekat;
        NewClass nc1 = (NewClass)o;
        System.out.println(nc1.y);
        
        String[] motori = {"Yamaha","Kawasaki","Honda","Suzuki"};
        System.out.println(Arrays.toString(motori));
    }
    
}
