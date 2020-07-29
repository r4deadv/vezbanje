package ui;

import java.util.Scanner;
import model.Rezultat;

public class Interfejs {
    public int meni(){
        Scanner s = new Scanner(System.in);
        System.out.println("1.Novi  2.Brisi  3.Edit  4.Prikazi sve  5.Filter  6.Logout");
        return Integer.parseInt(s.nextLine());
    }
    
    public Rezultat getRezultat(){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = s.nextLine();
        System.out.println("Unesi km: ");
        double km = Double.parseDouble(s.nextLine());
        System.out.println("Unesi vreme: ");
        int vreme = Integer.parseInt(s.nextLine());
        return new Rezultat(ime, km, vreme);
    }
    
    public int getId(){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi id: ");
        return Integer.parseInt(s.nextLine());
    }
    
    public void izmeniRezultat(Rezultat rez){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = s.nextLine();
        rez.ime = ime.isEmpty() ? rez.ime : ime;
        System.out.println("Unesi km: ");
        String kmString = s.nextLine();
        if(!kmString.isEmpty()){
            rez.km = Double.parseDouble(kmString);
        }
        System.out.println("Unesi vreme: ");
        String vremeString = s.nextLine();
        if(!vremeString.isEmpty()){
            rez.vreme = Integer.parseInt(vremeString);
        }
    }
    
    public String getIme(){
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        return s.nextLine();
    }
    
    public String[] login(){
            Scanner s = new Scanner(System.in);
            System.out.println("Unesi ime: ");  
            String ime = s.nextLine();
            System.out.println("Unesi password: ");  
            String pass = s.nextLine();
            return new String[]{ime,pass};
    }
}
