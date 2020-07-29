package javaapplication148;
public class JavaApplication148 {
    public static void main(String[] args) {
        String gps = "22052014,44.756364,20.412598,051230,123143124122";
        String gpsH = "091133,44.756364,20.412598,22052014,123143124122,H";
        Tacka point = new Tacka();
        Tacka point1 = new Tacka();
        point.tacka(gps);
        point1.parse(gpsH);
        
        System.out.println(point);
        System.out.println("Date " + point.datum);
        System.out.println("Time " + point.vreme);
        System.out.println("Lat " + point.latituda);
        System.out.println("Lon " + point.longituda);
        System.out.println("IMEI " + point.imei);
        System.out.println(point1);
    }
    
}
