package javaapplication120;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication120 {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Unesite ukupan broj sabiraka i pritisnite ENTER");
            int count = 0;
            count = s.nextInt();
            System.out.println("Unesite sabirke pa pritisnite ENTER");
            int sum = 0;
            if(numbers.size()<count){
                for(int i=0; i<count;i++){
                    numbers.add(s.nextInt());
                    sum += (int)numbers.get(i);
                }
                System.out.print("Sabirci su: ");
                for (Object number : numbers) {
                    System.out.print(number + " ");
                }
                System.out.println("\tZbir je: " + sum);
                break; 
        }
    }
    }
}

