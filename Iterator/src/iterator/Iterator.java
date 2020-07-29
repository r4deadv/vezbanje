package iterator;
public class Iterator {
    public static void main(String[] args) {
        MyColl mc = new MyColl();
        for (Object o : mc) {
            System.out.println(o);
        }
    }
    
}
