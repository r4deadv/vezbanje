package javaapplication116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JavaApplication116 {
    public static void main(String[] args) {
        
//        resenje sa listama
        int[] arr = {4,5,-2,-6, 3, 8};
        List poz = new ArrayList();
        List neg = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                poz.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        System.out.print("pozitivni:");
        for (Object p : poz) {
            System.out.print("\t" + p);
        }
        System.out.print("\nnegativni:");
        for (Object n : neg) {
            System.out.print("\t" + n);
        }
        System.out.println();
            }
        }
        
        
//        primeri za liste
//        List al = new ArrayList();
//        al.add("Hello");
//        al.add("World");
//        al.add(10);
//        System.out.println(al.get(1));
//        System.out.println(al.get(2));
//        
//        int x = (int)al.get(2);
//        System.out.println(x);
//        
//        String a = (String)al.get(0) + " " + (String)al.get(1);
//        System.out.println(a);
//        System.out.println("Clanovi liste:");
//        for(int i=0; i<al.size();i++){
//            System.out.println("("+i+") " + al.get(i));
//        }
//        al.set(2, "Two");
//        al.remove("Hello");
//        for (Object o : al) {
//            System.out.println(o);            
//        }
//        for (Object object : al) {
//            String s = (String)object;
//            System.out.println("String: " + s); 
//        }
        
//        resenje sa nizovima
//        int[] arr = {4,5,-2,-6, 3, 8};
//        int poz = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>=0){
//                poz++;  
//            }
//        }
//        int[] pozitivni = new int[poz];
//        int[] negativni = new int[arr.length-poz];
//        int pb=0, nb=0;
//        for(int j=0; j<arr.length;j++){
//            if(arr[j]>=0){
//                pozitivni[pb++]=arr[j];
//            }else {
//                negativni[nb++]=arr[j];
//            }
//        }
//        System.out.println(Arrays.toString(pozitivni));
//        System.out.println(Arrays.toString(negativni));
    
    

