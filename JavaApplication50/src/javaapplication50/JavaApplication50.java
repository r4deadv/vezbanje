package javaapplication50;
public class JavaApplication50 {
    public static void main(String[] args) {
        Nekretnina n = new Nekretnina(100,"Nosa");
        n.predstaviSe();
        
        Nekretnina n1 = new Nekretnina(15000,"Bezanija 40kvm");
        n1.predstaviSe();
        
        double x = n.cenaSaPorezom();
        System.out.println(x);
               
    }
    
}
