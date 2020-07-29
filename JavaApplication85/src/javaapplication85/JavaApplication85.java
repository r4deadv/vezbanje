package javaapplication85;

import java.util.Arrays;
import java.util.Random;

public class JavaApplication85 {
    public static void main(String[] args) {
        String[] niz = {"Heart","Cherry","Coin","Melon","Jocker"};
        Random r = new Random();
        System.out.println(
                niz[r.nextInt(5)]+" "+niz[r.nextInt(5)]+" "+niz[r.nextInt(5)]+" "+niz[r.nextInt(5)]+" "+niz[r.nextInt(5)]
        );
        
        
        for(int i=0;i<niz.length;i++){
            System.out.println(niz[i]);
        }
        //stampanje niza
        System.out.println(Arrays.toString(niz));
    }
    
}
