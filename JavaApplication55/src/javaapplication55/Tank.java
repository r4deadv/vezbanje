package javaapplication55;
public class Tank extends Vozilo{
    int steta;
    float kalibar;
    public Tank (String model, float brzina, int steta, float kalibar){
        //roditeljskoj klasi treba dati model i brzinu
        super (model, brzina);
        this.steta = steta;
        this.kalibar = kalibar;
    }
    public Tank(){
        super("nesto", 1);//moze da se overload-uje i konstruktor
    }

    @Override
    public void prikazi (){
        super.prikazi();
        System.out.println(", steta " + this.steta + ", kalibar " + this.kalibar);
    }
    public void prikazi(boolean b){
        System.out.println("steta" + this.steta + ", kalibar " + this.kalibar);
    }

    @Override
    public String toString() {
        return "steta" + this.steta + ", kalibar " + this.kalibar;
    }
    
}
