package javaapplication124;

import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication124 {
    public static void main(String[] args) {
        HashMap jezici = new HashMap();
        jezici.put("sr", "Dobar dan");
        jezici.put("en", "Welcome");
        jezici.put("it", "Benvenuti");
        jezici.put("de", "Guten Tag");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Unesite jezik (sr, en, it ili de)");
            String unos = scanner.nextLine();
            System.out.println(jezici.get(unos));
        }
    }
    
}
