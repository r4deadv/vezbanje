package javaapplication125;

import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication125 {
   public static void main(String[] args) {
       HashMap sr = new HashMap();
       sr.put("hello", "Dobar dan");
       sr.put("first", "Unesite prvi sabirak");
       sr.put("second", "Unesite drugi sabirak");
       sr.put("result", "Rezultat je");
       
       HashMap en = new HashMap();
       en.put("hello", "Welcome");
       en.put("first", "Enter first operand");
       en.put("second", "Enter second operand");
       en.put("result", "The result is");
       
       HashMap it = new HashMap();
       it.put("hello", "Benvenuto");
       it.put("first", "Inserisci il primo operando");
       it.put("second", "Immettere il secondo operando");
       it.put("result", "Il risultato è");
       
       HashMap jezici = new HashMap();
       jezici.put("srpski", sr);
       jezici.put("engleski", en);
       jezici.put("italijanski", it);
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Unesi jezik");
       String lang = scanner.nextLine();
       
       HashMap jezik = (HashMap)jezici.get(lang);
       
       System.out.println(jezik.get ("hello"));
       System.out.println(jezik.get("first") + ": ");
       int a = scanner.nextInt();
       System.out.println(jezik.get("second") + ": ");
       int b = scanner.nextInt();
       System.out.println(jezik.get("result") + ": " + (a+b));    
    }
    
}
