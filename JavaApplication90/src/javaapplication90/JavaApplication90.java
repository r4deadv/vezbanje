package javaapplication90;

import java.util.Arrays;

public class JavaApplication90 {
    public static void main(String[] args) {
        int[] array = {2,-5,4,12,54,-2,-50,150};
        int[] negativniNiz = new int[array.length];
        int[] pozitivniNiz = new int[array.length];
        int countp = 0;
        int countn = 0;
//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            int clan = array[i];
            if(clan>=0){
                pozitivniNiz[i] = clan;
            }else{
                negativniNiz[i] = clan;
            }
        }
        for(int j=0;j<pozitivniNiz.length;j++){
            if(pozitivniNiz[j]!=0){
                countp++;
            }
        }
        for(int k=0;k<negativniNiz.length;k++){
            if(negativniNiz[k]!=0){
                countn++;
            }
        }
        
//        System.out.println("duzina pozitivnog niza "+countp);
//        System.out.println("duzina negativnog niza "+countn);
        Arrays.sort(pozitivniNiz);
        Arrays.sort(negativniNiz);
//        System.out.println(Arrays.toString(pozitivniNiz));
//        System.out.println(Arrays.toString(negativniNiz));
        
        int negativni[] = Arrays.copyOfRange(negativniNiz, 0, countn);
        System.out.println(Arrays.toString(negativni));
        
        int pozitivni[] = Arrays.copyOfRange(pozitivniNiz, (pozitivniNiz.length-countp), pozitivniNiz.length);
        System.out.println(Arrays.toString(pozitivni));
    }    
}    
    

