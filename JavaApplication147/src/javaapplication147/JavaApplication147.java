package javaapplication147;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaApplication147 {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        
        String unetoVreme = "25 02 2020";
        LocalDate dt1 = LocalDate.parse(unetoVreme, DateTimeFormatter.ofPattern("dd MM yyyy"));
        System.out.println(dt1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        
        LocalDate now = LocalDate.now();
        System.out.println("Current date " + now);
        System.out.println("Current month " + now.getMonth() + " (" + now.getMonthValue() + ") ");
        System.out.println("Current year " + now.getYear());
        System.out.println("Current day " + now.getDayOfMonth() + " (" + now.getDayOfWeek() + ") ");
        
        LocalTime userDefinedTime = LocalTime.of(10, 15, 32);
        System.out.println(userDefinedTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H-m-s");
        System.out.println(formatter.format(userDefinedTime));
        
        LocalTime vremeSad = LocalTime.now();
        System.out.println("Current hour " + vremeSad.getHour());
        System.out.println("Current minute " + vremeSad.getMinute());
        System.out.println("Current second " + vremeSad.getSecond());
        System.out.println("Current nanosecond " + vremeSad.getNano());
        System.out.println(vremeSad);
        
        
        LocalDateTime datum = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(datum);
    }
    
}
