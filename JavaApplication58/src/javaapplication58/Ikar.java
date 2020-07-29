package javaapplication58;
public class Ikar implements Hitable, IStun{

    @Override
    public void pogodjen(int damage) {
        System.out.println("Al' sam te pres'o!!!");
           
    }

    @Override
    public void stun(int time) {
        System.out.println("Ja sam stunovan na " + time + "  sekundi");
    }
    
}
