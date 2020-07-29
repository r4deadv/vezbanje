package model;
public class Rezultat {
    public int id;
    public String ime;
    public double km;
    public int vreme;
    public Rezultat(int id, String ime, double km, int vreme){
        this.id = id;
        this.ime = ime;
        this.km = km;
        this.vreme = vreme;
    }
    public Rezultat(String ime, double km, int vreme){
        this.ime = ime;
        this.km = km;
        this.vreme = vreme;
    }
    public Rezultat(){}

    @Override
    public String toString() {
        return "Id: " + this.id + ", ime: " + this.ime + ", km: " + this.km + ", vreme: " + this.vreme; 
    }
    
}
