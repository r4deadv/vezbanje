package javaapplication35;

public class JavaApplication35 {

    public static void main(String[] args) {
        
        int tx = 4;
        int ty = 5;
        int px = 1;
        int py = 5;
        
        System.out.println("Pogodjen " + (px++==tx && py==ty));
        System.out.println("Pogodjen " + (px++==tx && py==ty));
        System.out.println("Pogodjen " + (px++==tx && py==ty));
        System.out.println("Pogodjen " + (px++==tx && py==ty));

    }
    
} 
