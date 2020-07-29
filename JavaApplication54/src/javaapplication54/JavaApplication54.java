package javaapplication54;
public class JavaApplication54 {
    static void newmethod (int x, NewClass nc) {
        x = 25;
        nc.x = 45;
    }
    public static void main(String[] args) {
       int x = 10;
       NewClass nc = new NewClass();
       nc.x = 15;
       newmethod(x, nc);
       System.out.println(x);
       System.out.println(nc.x);
       
        
       /*int x = 10;
       int y = x;
       x = 15;
       
       NewClass nc = new NewClass();
       nc.x = 5;
       NewClass nc1 = nc;
       nc1.x = 25;
       
       System.out.println(x);
       System.out.println(nc.x);*/
    }
    
}
