package javaapplication123;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication123 {
    public static void main(String[] args) {
        System.out.println("************ HashMap ****************");
        HashMap bot = new HashMap();
        bot.put("soraka", "Aleksandar");
        bot.put("fiddlesticks", "Vladimir");
        bot.put("cait", "Stefan");
        
        for(Object o : bot.entrySet()){
            Map.Entry e = (Map.Entry)o;
            System.out.print(e.getKey()+ " : ");
            System.out.println(e.getValue());
        }
        Iterator iter = bot.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry kvp = (Map.Entry)iter.next();
            System.out.println(kvp.getKey() + ":" + kvp.getValue());
        }
        
        
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Unesi heroja");
//            String heroj = scanner.nextLine();
//            System.out.println("Heroja ("+heroj+") igra " + bot.get(heroj));
//        }
    }
    
}
