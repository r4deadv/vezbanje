package javaapplication104;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication104 {
    public static void main(String[] args) {
        
        HashMap bot = new HashMap();
        bot.put("soraka", "Aleksandar");
        bot.put("fiddlesticks", "Vladimir");
        bot.put("cait", "Stefan");
        
//        iteracija kroz clanove
//        for (Object o : bot.entrySet()) {
//            Map.Entry e = (Map.Entry)o;
//            System.out.print(e.getKey()+"\t");
//            System.out.println(e.getValue());
//            
//        }
        
//        System.out.println(bot.get("soraka"));
//        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Unesi heroja:");
            String heroj = scanner.nextLine();
            System.out.println("Heroja (" + heroj + ") igra " + bot.get(heroj));
        }
    }
    
}
