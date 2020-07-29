package javaapplication49;
public class JavaApplication49 {
    public static void main(String[] args) {
        /*Nekretnina n = new Nekretnina();
        n.cena = 15000;
        n.opis = "Miljakovac 35kvm";
        
        System.out.println("Cena: " + n.cena + " EUR");
        System.out.println("Opis: " + n.opis);
        
        novipaket.NovaKlasa nk = new novipaket.NovaKlasa();
        nk.opis = "Klasa iz drugog paketa";
        System.out.println(nk.opis);*/
        
        Nekretnina n1 = new Nekretnina();
        //n1.opis = "Novi Beograd, 100kvm";
        n1.cena = 100000;
        n1.cena += n1.cena*Nekretnina.POREZ;
        
        Nekretnina n2 = new Nekretnina();
        n2.opis = "Bezanija, 50kvm";
        n2.cena = 50000;
        n2.cena += n2.cena*Nekretnina.POREZ;
        
        n1.hello();
        Nekretnina.main(); 
        
        System.out.println(n1.opis);
        System.out.println(n1.cena);
        System.out.println(n2.opis);
        System.out.println(n2.cena);
        
        
    }
    
    
}
