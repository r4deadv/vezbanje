package javaapplication14;

import java.util.Scanner;

/**
 * @version 1.0
 * @author r4de
 */
public class JavaApplication14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite stsrost radnika ");
        int age = scanner.nextInt();
        System.out.println("Unesite vrednost plate radnika ");
        double salery = scanner.nextDouble();
        System.out.println("Radnik ima " + age + " godina i " + salery + " dinara platu.");

    }
    
}
