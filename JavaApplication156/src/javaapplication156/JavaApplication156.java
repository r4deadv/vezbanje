package javaapplication156;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication156 {
    public static void main(String[] args) {
       while(true){
           try {
                System.out.print("prvi sabirak: ");
                int prviSabirak = new Scanner(System.in).nextInt();
                System.out.print("drugi sabirak: ");
                int drugiSabirak = new Scanner(System.in).nextInt();
                int zbir = prviSabirak + drugiSabirak;
                System.out.print("zbir: " + zbir + "\n");
           } catch (InputMismatchException e) {
                System.out.println("Morate uneti ceo broj");
           }
               
          
       }
    }
    
}
