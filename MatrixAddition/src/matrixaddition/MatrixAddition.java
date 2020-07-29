package matrixaddition;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = {
            {2,4,5},
            {1,3,7},
            {6,2,8}
        };
        int[][] B = {
            {1,3,1},
            {8,9,4},
            {5,3,2}
        };
        int[][] C = new int[3][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
