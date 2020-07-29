package javaapplication134;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class JavaApplication134 {
    public static void main(String[] args) {
        System.out.println("********** Queue **********");
        Queue persons = new LinkedList();
        persons.add("Superman");
        persons.add("Hulk");
        persons.add("Spiderman");
        while(!persons.isEmpty()){
            System.out.println(persons.poll());
        }
        
        
        };
    }
    

