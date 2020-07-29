package javaapplication57;
public class Krug extends Shape {
    public final double PI = 3.14;
    double r;
    public Krug(String naziv, String boja, double r){
        super(naziv,boja);
        this.r = r;
    }
    public double area(){
        double area = r*r*PI;
        return area;
    }
    @Override
    public String toString(){
        return "Povrsina kruga je: " + this.area();
    }
}
