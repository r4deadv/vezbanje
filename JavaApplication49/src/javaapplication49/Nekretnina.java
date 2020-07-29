package javaapplication49;
class Nekretnina {
    String opis;
    double cena;
    final static double POREZ = 0.01;
    
    Nekretnina () {
        opis = "Novi Beograd, 100kvm";
        
    } 
    void hello () {
        cena = 100;
    }
    public static void main () {
        System.out.println("Cao iz statickog metoda");
    }
}
