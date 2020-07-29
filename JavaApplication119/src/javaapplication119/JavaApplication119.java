package javaapplication119;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication119 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Upisite ukupan broj sabiraka");
       int count = scanner.nextInt();
       int[] array = new int[count];
       while(true){
           System.out.println("Unesite sabirke i pritisnite ENTER");
           int sum =0;
           for(int i=0; i<array.length; i++){
               array[i] = scanner.nextInt();
               sum+= array[i];
           }
           System.out.println("Sabirci su: " + Arrays.toString(array) + " Zbir je: " + sum);
           break;
       }
    }
    
}
