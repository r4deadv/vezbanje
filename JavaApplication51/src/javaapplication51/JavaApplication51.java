package javaapplication51;
public class JavaApplication51 {
    public static void main(String[] args) {
        Car.HowManyWheels();
        Car auto = new Car();
        auto.make = "BMW";
        auto.numDoors = 4;
        auto.printDetails();
    }
    
}
