package javaapplication55;
public class JavaApplication55 {
    public static void main(String[] args) {
        Tank t34 = new Tank("T34", 40, 400, 120);
        t34.prikazi();
        
        Amfibija pt76 = new Amfibija("pt76", 100, 10, 15);
        pt76.prikazi();
        
        Tank t86 = new Tank("T86", 65, 500, 160);
        t86.prikazi();
        t86.prikazi(true);
        
        System.out.println(t86);
    }
    
}
