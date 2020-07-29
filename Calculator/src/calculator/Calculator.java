package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator = "*";
        System.out.println("Unesite prvi broj");
        double operand1 = scanner.nextDouble();
        System.out.println("Unesite drugi broj");
        double operand2 = scanner.nextDouble();
        //System.out.print("Rezultat je ");
        if(operator == "+"){
            System.out.println("zbir je " + operand1 + operand2);
        } else 
        if(operator=="-"){
                System.out.println("razlika je " + (operand1 - operand2));
        } else 
        if(operator=="*"){
                System.out.println("proizvod je " + (operand1 * operand2));
        } else 
        if(operator=="/"){
                System.out.println("kolicnik je " + (operand1 / operand2));  
        } else {
                System.out.println("Nema racunske operacije");
        }
        
    }
    
}
