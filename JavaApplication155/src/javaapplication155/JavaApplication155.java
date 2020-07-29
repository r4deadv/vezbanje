package javaapplication155;

import java.util.Scanner;

public class JavaApplication155 {
    public static void f(){
        int x = 10;
        int y = 0;
        int z = 0;
        int[] arr = {};
        try {
            arr[0] = 10;
            String ime = "Rade";
            ime.charAt(24);
            z = x / y;
            System.out.println(z);
            System.out.println("Ovo je zavrseno");
        } catch(StringIndexOutOfBoundsException ex){
            System.out.println("Puklo je zato sto si prekrsio velicinu niza");
        } catch(ArithmeticException ex){
            System.out.println("Aritmeticka greska");
        } catch(Exception ex){
            System.out.println("Nisam uspeo da resim problem");
        }
        System.out.println(z);
    }
    public static void main(String[] args) {
//        int x = 10;
//        int unetiBroj = new Scanner(System.in).nextInt();
//        int y = unetiBroj;
//        int z = unetiBroj !=0 ? x / y : 0;
//        System.out.println(z);

        f();
    }
    
}
