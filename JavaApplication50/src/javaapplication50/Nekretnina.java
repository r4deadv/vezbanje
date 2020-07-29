package javaapplication50;
public class Nekretnina {
    double cena;
    String opis;
    final static double POREZ = 0.01;

    public Nekretnina(double c, String o) {
        cena = c;
        opis = o;
    }
    
    double cenaSaPorezom () {
        return cena + (cena * POREZ);
    }
    
    void predstaviSe () {
        System.out.println("Opis: " + opis);
        System.out.println("Cena: " + cena);
        System.out.println("Cena sa porezom: " + cenaSaPorezom());
    }
}
