package shop;
public class Chocolate extends Product implements IGetPrice {
    public double tezina;
    public double cena;
    public Chocolate(String naziv, String barKod, double osnovnaCena, double tezina) {
        super(naziv, barKod, osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    public double getCena() {
        cena = osnovnaCena + POREZ;
        return cena;
    }
    @Override
    public String toString(){
        return "Cokolada " + naziv + " je teska " + this.tezina + "g sa bar kod brojem: " + this.barKod + " i kosta " + this.cena + " dinara.";
    }
}
