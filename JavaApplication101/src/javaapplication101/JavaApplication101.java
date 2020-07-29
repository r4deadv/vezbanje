package javaapplication101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaApplication101 {
    public static void main(String[] args) {
        
        List al = new ArrayList();
        
        al.add("Hallo");
        al.add("World");
        al.add(10);
        al.add(20);
        al.remove(3);
        System.out.println("Size: " + al.size());
        
        int x = (int)al.get(2); 
        String y = (String)al.get(1);
        System.out.println(x);
        System.out.println(y);

        System.out.println(al.get(1));
        System.out.println("Treci clan lise je " + al.get(2));
        
        for (int i=0;i<al.size();i++) {
            System.out.println(al.get(i));
        }
        
        for (Object o : al) {
            System.out.println(o);
        }
        
        int[] arr = {4,5,-2,-6,3,8};
        List poz = new ArrayList();
        List neg = new ArrayList();
        for (int i=0;i<arr.length;i++) {
            if(arr[i]>=0)
                poz.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        for(Object o : poz) System.out.print(o);
        System.out.println();
        for (Object o : neg)System.out.print(o);
            
        
//        konverzija objekta u String
//        for (Object o:al) {
//            String s = (String)o;
//            System.out.println(s);
//        }
        
//        int[] arr = {4,5,-2,-6,3,8};
//        int pozitivnih = 0;
//        for(int broj:arr){
//            if(broj>=0)
//                pozitivnih++;
//        }
//        int[] poz = new int[pozitivnih];
//        int[] neg = new int[arr.length-pozitivnih];
//        int j=0,k=0;
//        for (int broj:arr) {
//            if(broj>=0)
//                poz[ j++ ]= broj;
//            else neg[k++] = broj;    
//        }
//        System.out.println(Arrays.toString(poz));
//        System.out.println(Arrays.toString(neg));
    }
    
}
