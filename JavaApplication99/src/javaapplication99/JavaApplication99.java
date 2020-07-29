package javaapplication99;

import java.util.Arrays;

public class JavaApplication99 {
    public static void main(String[] args) {
        int[] array = {2,-5,4,12,54,-2,-50,150};
        int poz=0, neg=0, i=0, j=0;
        for(int broj: array){
            if(broj>=0){
                poz++;
            }else{
                neg++;
            }
        }
        int[] pozitivni = new int[poz];
        int[] negativni = new int[neg];
        for(int k=0;k<array.length;k++){
            if(array[k]>=0){
                pozitivni[i++]=array[k];
            }else{
                negativni[j++]=array[k];
            }
        }
        System.out.println(Arrays.toString(pozitivni));
        System.out.println(Arrays.toString(negativni));
    }
    
}
