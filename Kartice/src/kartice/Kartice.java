package kartice;

import java.util.Scanner;

public class Kartice {
    public static void main(String[] args) {
        Card kartica = new Card(200);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Unesite sumu koju skidate sa kartice");
//        kartica.amount = scanner.nextDouble();
        kartica.charge(50);
        kartica.charge(100);
        kartica.charge(90);
        System.out.println(kartica.balance);
        
    }
    
}
