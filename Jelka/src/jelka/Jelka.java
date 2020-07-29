package jelka;
public class Jelka {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            Thread.sleep(200);
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
                Thread.sleep(260);
            }
                System.out.println();       
        } 
}
}
    
