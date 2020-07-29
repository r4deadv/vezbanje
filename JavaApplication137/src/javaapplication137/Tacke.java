package javaapplication137;
public class Tacke {
    public int x;
    public int y;
    
    public Tacke(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x:" + this.x + " y:" +  this.y;
    }
}
