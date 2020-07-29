package javaapplication149;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;

public class JavaApplication149 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime userDefinedTime = LocalTime.of(15, 35, 20);
        Duration d = Duration.between(userDefinedTime, timeNow);
        System.out.println(d);
        
        LocalDate dateNow = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 11, 18);
        Period p = Period.between(dateNow, date);
        System.out.println(p);
        
        Instant start = Instant.now();
        //System.out.println(Instant.ofEpochMilli(new Date().getTime()));
        Instant end, seconddiff = Instant.now();
        Random random = new Random();
        float desiredFps = random.nextFloat()*100;
        float etafps = 1000.0f/desiredFps;
        int currentTime = 0, fps = 0, totalFps = 0, count = 0;
        int avgFps = 0;
        while(true){
            end = Instant.now();
            if(start.until(end, ChronoUnit.MILLIS)>=etafps){
                start = Instant.now();
                fps++;
                totalFps++;
            }
            if(seconddiff.until(end, ChronoUnit.MILLIS)>=1000){
                System.out.print("Fps " + fps + " avgFps " + avgFps + "\r");
                fps = 0;
                count++;
                avgFps = totalFps / count;
                seconddiff = Instant.now();
            }
        } 
    } 
}
