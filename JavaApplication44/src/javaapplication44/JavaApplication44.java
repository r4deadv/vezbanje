package javaapplication44;

public class JavaApplication44 {

    public static void main(String[] args) {
       int data_1 = 0b00001010;
       int data_2 = 0b10010101;
       int parity = data_1 ^ data_2;
       
        System.out.println(data_1 ^ parity);
        System.out.println(data_2 ^ parity);
    }
    
}
