
public class AritmetickiOperatori {
    
    public static void main(String[] args) {
        
        int a = 2, b = 3, c = 4;
        int res = a * b + c - a;
        System.out.println("prvi rezultat je " + res);
        
        int res1 = a * (b + c - a);
        System.out.println("drugi rezultat je " + res1);
        
        String s1 = "Hello world";
        String s2 = "from Java";
        System.out.println(s1+s2);
        
        String t1 = "Proizvodi:\n";
        t1 = t1 + "Telefon\n";
        t1 = t1 + "Ves masina\n";
        t1 = t1 + "Igracka\n";
        System.out.println(t1);
    }
    
}
