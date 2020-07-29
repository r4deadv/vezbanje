package javaapplication81;
public class JavaApplication81 {
    public static void f(int counter){
        System.out.println("Pozdrav iz funkcije f " + counter);
        if(counter>1){
            f(--counter);
        }
    }
    public static void main(String[] args) {
        f(10);
    }
    
}
