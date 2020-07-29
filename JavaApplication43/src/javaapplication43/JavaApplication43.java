
package javaapplication43;

public class JavaApplication43 {

    public static void main(String[] args) {
       
        int POLAZNIK = 0b0001;
        int MENADZER = 0b0010;
        int PREDAVAC = 0b0100;
        int maska = PREDAVAC | MENADZER;
        int ulogovaniKorisnik = 2;
        System.out.println(ulogovaniKorisnik & maska);
        
    }
    
}
