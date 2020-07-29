package javaapplication118;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication118 {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner s = new Scanner(System.in);
        System.out.println("Insert numbers and press ENTER, when done press Enter again to finish summation");
        while (true) {            
            String input = s.nextLine();
            if(!input.equals("")){
                numbers.add(Integer.parseInt(input));
            } else {
                int sum = 0;
                System.out.print("Inserted numbers are: ");
                for (int i=0; i<numbers.size(); i++) {
                    sum += (int)numbers.get(i);
                    System.out.print(numbers.get(i) + " ");
                }   
                System.out.println("\tResult is: " + sum);
                break;
            }
        }
    }
}
    
    

