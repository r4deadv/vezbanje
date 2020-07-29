package javaapplication55;
public class Amfibija extends Vozilo {
    int kapacitet;
    float plovnaBrzina;
    public Amfibija (String model, float brzina, int kapacitet, float plovnaBrzina){
        super (model, brzina);
        this.kapacitet = kapacitet;
        this.plovnaBrzina = plovnaBrzina;
    }   
    public void prikazi(){
        super.prikazi();
        System.out.println(", kapacitet " + this.kapacitet + ", plovna brzina " + this.plovnaBrzina);
    }
       
}
