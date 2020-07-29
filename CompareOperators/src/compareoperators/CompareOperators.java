
package compareoperators;

import java.util.Scanner;


public class CompareOperators {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String unetaSifra = scanner.nextLine();
       String nasaSifra = "123";
       //poredjenje stringa
       boolean userOK = nasaSifra.equals(unetaSifra);
       
       System.out.println(userOK);
    }
    
}
