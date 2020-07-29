package calculatorswitchcase;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite prvi broj ");
        double op1 = scanner.nextDouble();
        System.out.println("Unesite drugi broj ");
        double op2 = scanner.nextDouble();
        System.out.println("Unesite racunski operator (+,-,* ili /)");
        operator = scanner.next();
        
        switch(operator){
            case "+":
                System.out.println("Zbir je " + (op1 + op2));
            break;
            case "-":
                System.out.println("Razlika je " + (op1 - op2));
            break;
            case "*":
                System.out.println("Proizvod je " + (op1 * op2));
            break;
            case "/":
                System.out.println("Kolicnik je " + (op1 / op2));
            break;
            default: 
                System.out.println("Izabrali ste nepostojecu racunsku operaciju ");
            break;
            
        }
                
    }
    
}
