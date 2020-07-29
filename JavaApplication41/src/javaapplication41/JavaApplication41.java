
package javaapplication41;

public class JavaApplication41 {

    public static void main(String[] args) {
        int polaznik = 1;
        int predavac = 2;
        int menadzer = 4;
        int direktor = 8;
        
        int maska = predavac | menadzer | direktor;
        //korisnik mora imati jednu od ovih kategorija
        int ulogovaniKorisnik = 4;
        
        System.out.println(ulogovaniKorisnik & maska);
    }
    
}
