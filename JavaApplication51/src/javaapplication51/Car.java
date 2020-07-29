package javaapplication51;
public class Car {
    String make;
    String model;
    int numDoors;
    static int wheels = 4;
    public Car () {
        model = "I5";
    }
    public static void HowManyWheels () {
        System.out.println(wheels);
    }
    void printDetails () {
        System.out.println("Make " + make);
        System.out.println("Model " + model);
        System.out.println("Number of doors " + numDoors);
    }
}
