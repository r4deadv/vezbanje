package javaapplication80;
public class JavaApplication80 {
    static int x = 0;
    static int recursive_repeats = 1;
    public static void f(){
        System.out.println("Cao iz funkcije f " + (x++)); 
        if(recursive_repeats++<10){
        f();
        }
    }
    public static void main(String[] args) {
        f();
    }
    
}
