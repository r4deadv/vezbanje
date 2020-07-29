package javaapplication105;

import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication105 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("sr", "Dobar dan");
        hm.put("en", "Hello");
        hm.put("de", "Guten Tag");
        hm.put("it", "Benvenuti");
        
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Choose langugae: ");
        String jezik = scanner.nextLine();
        System.out.println(hm.get(jezik));
        }
        
        
        
    }
    
}
