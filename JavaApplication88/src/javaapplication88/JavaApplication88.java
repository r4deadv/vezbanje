package javaapplication88;
public class JavaApplication88 {
    public static void main(String[] args) {
        String[] vozilo = {"Bicikl","Automobil","Mobilni telefon"};
        String[] naziv = {"BMX","Reno 4","I-phone"};
        double[] cena = {150.55, 100, 500};
        
        for(int i=0;i<vozilo.length;i++){
            System.out.println(vozilo[i] +" is type " + naziv[i] + " and it costs " + cena[i]);
        }

        
    }
    
}
