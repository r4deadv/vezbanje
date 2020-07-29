
package javaapplication31;


public class JavaApplication31 {

    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        
        int a = 10;
        int b = ++a;
        int d = 2;
        int c = d+=5;
        
        System.out.println("x je " + x);
        System.out.println("y je " + y);
        
        System.out.println("a je " + a);
        System.out.println("b je " + b);
        System.out.println("c je " + c);
        
        int r = 2;
        int m = 3;
        int res = r * (m++) + m;
        int res1 = r * (++m) + m;
        
        System.out.println(res);
        System.out.println(res1);
        
        boolean daLiCemoNaucitiJavu = !false;
        System.out.println(daLiCemoNaucitiJavu);
        
    }
    
}
