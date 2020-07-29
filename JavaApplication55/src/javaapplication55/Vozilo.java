package javaapplication55;
public class Vozilo {
    String model;
    float brzina;
    public Vozilo(String m, float b){
        model = m;
        brzina = b;
    }
    public void prikazi(){
        System.out.println("Model " + model + ", brzina " + brzina);
    }
}