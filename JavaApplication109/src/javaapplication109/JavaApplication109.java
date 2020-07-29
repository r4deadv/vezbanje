package javaapplication109;
public class JavaApplication109 {
    public static void main(String[] args) {
        Karta k = new Karta();
        k.setBroj(1);
        k.setBoja("crvena");
        k.setSifra("kralj");
        
        System.out.println(k.getBroj()+" "+k.getBoja()+" "+k.getSifra());
    }
    
}
