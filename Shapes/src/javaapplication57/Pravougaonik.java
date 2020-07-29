package javaapplication57;
public class Pravougaonik extends Shape {
    public int a;
    public int b;
    public Pravougaonik(String naziv, String boja, int a, int b){
        super (naziv,boja);
        this.a = a;
        this.b = b;
    }
    public int area(){
        int area = a*b;
        return area;
    }
    @Override
    public String toString(){
        return "Povrsina pravougaonika je: " + area();
    }
}
