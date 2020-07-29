package javaapplication91;

import java.util.Arrays;

public class JavaApplication91 {
    public static void main(String[] args) {
        /*
        [0,1]
        [0,0]
        [0,0]
        */
//        int[][] trougao = new int[3][];
//        trougao[0] = new int[2];
//        trougao[0][1] = 1;
//        trougao[0][0] = 1;
//        
//        trougao[1] = new int[2];
//        trougao[2] = new int[2];

        int trougao[][] = {{0,0},{1,1},{1,0}};
        
        System.out.println(Arrays.toString(trougao[0]));
        System.out.println(Arrays.toString(trougao[1]));
        System.out.println(Arrays.toString(trougao[2]));
        
        String[][] imena = {
            {"Deda","Mraz"},{"Bozic","Bata"},{"Snesko","Belic"},{"Jean","Paul","Belmondo"}
        };
        for(String[] ime: imena){
            for(int i=0;i<ime.length;i++){
                System.out.print(ime[i] + " ");  
            }
            System.out.println(); 
        }
    }
    
}
