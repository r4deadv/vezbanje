package javaapplication148;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tacka {
    public  LocalDate datum;
    public  float latituda;
    public  float longituda;
    public  LocalTime vreme;
    public  long imei;
    
    public Tacka tacka(String gps){
        Tacka point = new Tacka();
        String h = "H";
        String[] gpsArr = gps.split(",");
                //String dat = gpsArr[0];
                //DateTimeFormatter d = DateTimeFormatter.ofPattern("ddMMyyyy");
                datum = LocalDate.parse(gpsArr[0], DateTimeFormatter.ofPattern("ddMMyyyy"));
                latituda = Float.parseFloat(gpsArr[1]);
                longituda = Float.parseFloat(gpsArr[2]);
                //String time = gpsArr[3];
                //DateTimeFormatter t = DateTimeFormatter.ofPattern("HHmmss");
                vreme = LocalTime.parse(gpsArr[3], DateTimeFormatter.ofPattern("HHmmss"));
                imei = Long.parseLong(gpsArr[4]);
                return point;
    }
    public String toString(){
        return datum.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + " " +  vreme + " " + latituda + " " + longituda + " " +imei;
    }
    
      public Tacka parse(String gps){
        Tacka point = new Tacka();
        String h = "H";
        String[] gpsArr = gps.split(",");
                vreme = LocalTime.parse(gpsArr[0], DateTimeFormatter.ofPattern("HHmmss"));
                latituda = Float.parseFloat(gpsArr[1]);
                longituda = Float.parseFloat(gpsArr[2]);
                datum = LocalDate.parse(gpsArr[3], DateTimeFormatter.ofPattern("ddMMyyyy"));
                imei = Long.parseLong(gpsArr[4]);
                return point;
}
}
