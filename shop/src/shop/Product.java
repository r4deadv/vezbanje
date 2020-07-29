package shop;
public abstract class Product implements IGetPrice {
   public String naziv;
   public String barKod;
   public double osnovnaCena;
   public final double POREZ;
  
   public Product(String naziv, String barKod, double osnovnaCena){
       this.naziv = naziv;
       this.barKod = barKod;
       this.osnovnaCena = osnovnaCena;
       this.POREZ = osnovnaCena *20/100;
   }
   @Override
   public abstract double getCena();
}
