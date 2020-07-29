package javaapplication52;
public class Calculator {
    static double a;
    double b;
    double add (double a, double b){
        double res = a + b;
        return res;
    }
    double sub () {
        double res = a - b;
        return res;
    }
    double mul () {
        return a * b;
    }
    double div () {
        return a / b;
    }
    double calculate () {
        System.out.println("Zbir = " + add(a,b));
        System.out.println("Razlika = " + sub());
        System.out.println("Proizvod = " + mul());
        System.out.println("Kolicnik = " + div());
        return 0;
    }
}
