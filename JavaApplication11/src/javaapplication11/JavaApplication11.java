package javaapplication11;

import java.io.Console;

/**
 * @version 1.0
 * @author r4de
 */
public class JavaApplication11 {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter first operand:");
        //Get input with Console class
        String op1 = console.readLine();
        console.writer().println("Enter second operand:");
        String op2 = console.readLine();
        System.out.print("Result is ");
        System.out.println(Integer.parseInt(op1) + Integer.parseInt(op2));
        
    }
    
}
