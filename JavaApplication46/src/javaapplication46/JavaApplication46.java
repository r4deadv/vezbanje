
package javaapplication46;

import java.util.Scanner;

public class JavaApplication46 {

    public static void main(String[] args) {
        int x;
        System.out.println("Enter variable and press Enter");
        Scanner broj = new Scanner(System.in);
        x = broj.nextInt();
        System.out.println("Entered variable is " + x);
        boolean y = x%2==0;
        System.out.println("Variable is even " + y);
    }
    
}
