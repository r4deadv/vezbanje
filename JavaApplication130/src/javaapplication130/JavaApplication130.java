package javaapplication130;

import java.util.Arrays;

public class JavaApplication130 {
    public static void main(String[] args) {
        String message = "Hello from my string";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.replaceAll("l", "9"));
              
        char[] all_characters = message.toCharArray();
        for (char all : all_characters) {
            System.out.println(all);
        }
        
        String myint_string = String.valueOf(100);
        String myfloat_string = String.valueOf(10.5);
        String mychar_string = String.valueOf(new char[] {'R','a','d','e'});
        
        System.out.println(myint_string);
        System.out.println(myfloat_string);
        System.out.println(mychar_string);
        
        message = message.replace("Hello", "Zdravo");
        System.out.println(message);
        
        String[] arr_string = message.split(" ");
        for(String arr : arr_string){
            System.out.println(arr);
        }
        
        String reketi = "Willson.Head.Dunlop";
        String[] reketArr = reketi.split("\\.");
        for(String r : reketArr){
            System.out.println(r);
        }
    }
    
}
