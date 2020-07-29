package shop;
public class Wine extends Product implements IGetPrice {
    public double zapreminaBoce;
    public double cena;
    
    public double konacnaCena;
    public Wine(String naziv, String barKod, double osnovnaCena, double zapreminaBoce){
        super(naziv, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;
    }
    
    @Override
    public double getCena() {
        cena = osnovnaCena + POREZ;
        final double WHINE_POREZ = cena *10/100;
        konacnaCena = cena + WHINE_POREZ;
        return konacnaCena;
    }
   
    @Override
    public String toString(){
        return "Nsziv vina je " + this.naziv + " u boci od " + this.zapreminaBoce + " litara sa bar kodom " + this.barKod + " i kosta " + this.konacnaCena + " dinara.";
    }
    
}
