package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap sr = new HashMap();
        sr.put("hello", "Pozdrav i dobro dosli");
        sr.put("first", "Unesite prvi sabirak: ");
        sr.put("second", "Unesite drugi sabirak: ");
        sr.put("result", "Rezultat je");
        
        HashMap en = new HashMap();
        en.put("hello", "Hello and welcome");
        en.put("first", "Enter first operand: ");
        en.put("second", "Enter second operand: ");
        en.put("result", "The result is: ");
        
        HashMap zemunski = new HashMap();
        zemunski.put("hello", "De si tebra");
        zemunski.put("first", "Prvi??!!");
        zemunski.put("second", "Drugi??!!");
        zemunski.put("result", "Rezultat");
        
        HashMap jezici = new HashMap();
        jezici.put("srpski", sr);
        jezici.put("engleski", en);
        jezici.put("zemunski", zemunski);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter language (srpski, engleski, zemunski): ");
        String lang = scanner.nextLine();
        
        HashMap jezik = (HashMap)jezici.get(lang);
        
        System.out.println(jezik.get("hello")); 
        System.out.println(jezik.get("first"));
        int a = scanner.nextInt();
        System.out.println(jezik.get("second"));
        int b = scanner.nextInt();
        System.out.println(jezik.get("result") + ": " + (a+b));
    }
}
