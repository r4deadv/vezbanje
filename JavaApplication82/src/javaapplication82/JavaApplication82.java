package javaapplication82;
public class JavaApplication82 {
    static void counter(int start, RecursionControl stop){
        System.out.println("Hey, I'm called!");
        if(stop.value>start){
            return;
        }
        ++stop.value;
        counter(start--, stop);
        
    }
    public static void main(String[] args) {
        RecursionControl stop = new RecursionControl();
        int start = 5;
        stop.value = 2;
        counter(start, stop);
    }
    
}
