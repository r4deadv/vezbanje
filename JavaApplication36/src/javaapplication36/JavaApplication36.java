
package javaapplication36;

public class JavaApplication36 {

    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        
        boolean res = x<20&&x>10;
        System.out.println(res);
        
        res = x<20||x>10;
        System.out.println(res);
        
        //kod || ako je prvi rezultat tacan, drugi se ne proverava
        res = x==10 || ++y==20;
        System.out.println(res);
        System.out.println(y);
        
        //kod && ako prvi rezultat nije tacan, drugi se ne proverava
        res = x==11&&++y==20;
        System.out.println(res);
        System.out.println(y);
        
        y++;
        res = (
                (x>9&&x!=25&&y>19&&x!=10)||
                (y!=20&&y==10)||(x==1&&x==2&&x==3)
                || true
                );
        System.out.println("Rezultat je " + res);
    }
    
}
