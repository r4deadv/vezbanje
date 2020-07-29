package javaapplication52;

import java.util.Scanner;

public class JavaApplication52 {
    public static void main(String[] args) {
        Calculator digitron = new Calculator();
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj i pritisnite ENTER ");
        Calculator.a = scanner.nextDouble();
        System.out.println("Unesite drugi broj i pritisnite ENTER");  
        digitron.b = scanner.nextDouble();
         
        System.out.println("Prvi broj je " + Calculator.a);
        System.out.println("Drugi broj je " + digitron.b);
        digitron.calculate();
        
    }
    
}
