package javaapplication77;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication77 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Koji broj sam zamislio ?");
            int broj =s.nextInt();
            int zamisljeniBroj = r.nextInt(5);

            if(broj==zamisljeniBroj){
                System.out.println("Jeste");
                break;
            } else{
                System.out.println("Nije ("+zamisljeniBroj+")");
            }
        }
    }
}
