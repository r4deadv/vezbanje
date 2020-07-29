package javaapplication45;

import java.util.Scanner;

public class JavaApplication45 {
    
    public static void main(String[] args) {
        int REGULAR = 1;
        int ADMIN = 2;
        int SUPERADMIN = 4;
        int bitMask = REGULAR | ADMIN | SUPERADMIN;
        
        System.out.println("Enter your access level (1,2 or 4) ");
        Scanner scanner = new Scanner(System.in);
        bitMask = scanner.nextInt();
        System.out.println("User level is " + bitMask);
        boolean a = bitMask == REGULAR;
        boolean b = bitMask == ADMIN;
        boolean c = bitMask == SUPERADMIN;
       
        System.out.println("Regular user level: " + a);
        System.out.println("Admin user level: " + b);
        System.out.println("SuperAdmin user level: " + c);
        
    }
    
}
