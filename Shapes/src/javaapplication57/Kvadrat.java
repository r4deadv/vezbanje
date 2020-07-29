package javaapplication57;
public class Kvadrat extends Shape {
    public double a;
    public double area(){
        double area = a*a;
        return area;
    }
    public Kvadrat(String naziv, String boja, double a){
        super(naziv, boja);
        this.a = a;
    }
    @Override
    public String toString(){
        return "Povrsina kvadrata je: " + this.area();
    }
}
