package javaapplication87;

import java.util.Arrays;

public class JavaApplication87 {
    public static void main(String[] args) {
       int[] A = {1,2,3};
       int[] B = {4,5,6};
       
       //int[] C = {A[0]+B[0],A[1]+B[1],A[2]+B[2]};
       int[] C = new int[3];
       C[0] = A[0] + B[0];
       C[1] = A[1] + B[1];
       C[2] = A[2] + B[2]; 
//       for(int i=0;i<A.length;i++){
//           C[i] = A[i] + B[i];
//       } 
       System.out.println("Niz C "+Arrays.toString(C));
       
       
       
       
    }
    
}
