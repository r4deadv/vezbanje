package javaapplication86;

import java.util.Arrays;
import java.util.List;

public class JavaApplication86 {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        System.out.println("Niz array ima " + array.length + " clanova");
        
        int[] niz = {1,2,3,4,5};
        int[] niz1 = niz;
        niz1[3] =15;
        System.out.println(niz[3]);
        System.out.println(Arrays.toString(niz1));
        
        // array cloning
        int[] niz2 = niz.clone();
        System.out.println(Arrays.toString(niz2));
        niz2[2] = 50;
        System.out.println("niz" + Arrays.toString(niz));
        System.out.println("niz2" + Arrays.toString(niz2));
        System.out.println(niz[2]);
        
        //clone and arraycopy
        class MyClass { public int x; }
        MyClass myObj = new MyClass();
        myObj.x = 10;
        MyClass[] myClassArray = { myObj};
        MyClass[] myClassArray1 = myClassArray.clone();
        MyClass[] myClassArray2 = new MyClass[myClassArray.length];
        System.arraycopy(myClassArray, 0, myClassArray2, 0, myClassArray.length);
        myObj.x = 25;
        System.out.println(myClassArray1[0].x);
        System.out.println(myClassArray2[0].x);
        
        //convert array to list
        Integer[] arrays_of_ints = {1,2,3,4};
        List<Integer> convertedArray = Arrays.asList(arrays_of_ints);
        System.out.println(convertedArray.get(0));
        
        String[] cities = {"Paris", "London", "New York"};
        for(int i=0;i<cities.length;i++){
            System.out.println(cities[i]);
        }
        
        String[] jedi = { "Qui-Gon Jinn","Obi-Wan Kenobi","New York" };
        for(String city : cities){
            System.out.println(city);
        }
        
        String[] races = { "Ork","Undead","Elf" };
        int counter = 0;
        while(counter<races.length){
            System.out.println(races[counter++]);
        }
    }
}
