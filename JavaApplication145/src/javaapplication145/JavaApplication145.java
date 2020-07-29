package javaapplication145;

import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.calendar.Gregorian;

public class JavaApplication145 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, 20);
        c.set(Calendar.YEAR, 2015);
        c.set(Calendar.MONTH,11);
        System.out.println(c.getTime());
        System.out.println("Tacan mesec je " + (c.get(Calendar.MONTH)+1));
        
        GregorianCalendar sourceDate = new GregorianCalendar(2014,10,8);
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(Calendar.HOUR, -24);
        System.out.println(currentDate.before(sourceDate));
    }
    
}
