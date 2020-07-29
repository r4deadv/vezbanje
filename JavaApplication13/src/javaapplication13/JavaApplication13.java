package javaapplication13;

import java.util.Scanner;

/**
 * @version 1.0
 * @author r4de
 */
public class JavaApplication13 {

    public static void main(String[] args) {
        
        Scanner crevo = new Scanner(System.in);
        System.out.println("First operand is ");
        int x = crevo.nextInt();
        System.out.println("Second operand is ");
        int y = crevo.nextInt();
        
        System.out.println("Result is\n" + (x+y));
    }
    
}
