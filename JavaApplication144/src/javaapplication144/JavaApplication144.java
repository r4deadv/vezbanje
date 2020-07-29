package javaapplication144;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class JavaApplication144 {
    public static void main(String[] args) throws InterruptedException, ParseException {
       String startTime = "12 05 2020 15:53:05"; 
       
       for(Locale loc : Locale.getAvailableLocales()){
           System.out.println(loc.getDisplayName() + " " + loc.getLanguage());
       }
       
        //System.out.println("Game of Thrones pocinje: " + startTime);
        //System.out.println(System.currentTimeMillis());
        Date trenutnoVreme;
        
        Date vreme = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MM/dd/yyyy HH:m:ss",Locale.forLanguageTag("sr"));
        System.out.println("Parsirano vreme je: " + sdf.format(vreme));
        
        SimpleDateFormat sdfInput = new SimpleDateFormat("dd MM y HH:mm:ss");
        Date datumPocetka = sdfInput.parse(startTime);
        sdfInput.applyPattern("dd MM yyyy");
        System.out.println("Game of Thrones pocinje " + sdfInput.format(datumPocetka));
        
        System.exit(0);
        
        while(true){
            trenutnoVreme = new Date();
            System.out.println("Da li je pocelo?");
            System.out.println(datumPocetka.before(trenutnoVreme));
//            System.out.println("Trenutno vreme je " + trenutnoVreme);
//            System.out.println("Trenutno vreme je " + trenutnoVreme.getDate() + "/" + (trenutnoVreme.getMonth()+1) + " " + trenutnoVreme.getHours() + ":" + trenutnoVreme.getMinutes() + ":" + trenutnoVreme.getSeconds());
//            System.out.printf("Trenutno vreme je %1$tA, %1$tB %1$tY\n", trenutnoVreme);
            Thread.sleep(1000);
        }
    }
    
}
