package javaapplication111;

import java.util.Arrays;
import java.util.Locale;

public class JavaApplication111 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
//        for (int i = 0; i < x.length; i++) {
//            int clan = x[i];
//            System.out.println(clan);
//        }
//        for (int clan : x) {
//            System.out.println(clan);
//        }
//        String[] imena = {"pera", "laza", "zika"};
//        for (String clanovi : imena) {
//            System.out.println(clanovi); 
//        }
//        int[][] trougao = new int[3][];
//        trougao[0] = new int[2];
//        trougao[0][1] = 1;
//        trougao[0][0] = 1;
//        trougao[1] = new int[2];
//        trougao[2] = new int[2];
//        System.out.println(trougao[0]);

//        int trougao[][] = {{0,0},{1,1},{1,0}};
//        System.out.println(Arrays.toString(trougao[0]));
//        System.out.println(Arrays.toString(trougao[1]));
//        System.out.println(Arrays.toString(trougao[2]));

        String[][] imena = {{"Deda","Mraz"},{"Snesko","Belic"},{"Bozic","Bata"},{"Jean","Paul","Belmondo"}};
        //enhanced for loop
        for(String[] ime : imena){
            for(String drugiNiz : ime){
                System.out.print(drugiNiz + " ");
            }
            System.out.println();
        }
        
//        for(int i=0; i<imena.length; i++){
//            for(int j=0; j<imena[i].length; j++){
//                System.out.print(imena[i][j] + " ");
//            }
//            System.out.println();
//        }

        String[][] motori = {
            {"1","Yamaha R1","22"},
            {"5","Kawasaki NInja","30"},
            {"10","Suzuki GSXR","4"}
        };
        for (int i = 0; i < motori.length; i++) { 
//        String linija = String.format("Broj: %s, Motor: %s, Pozicija: %s", motori[i][0], motori[i][1], motori[i][2]);
//            System.out.println(linija);
            System.out.printf("Broj: %s, \tMotor: %s, \tPozicija: %s\n", motori[i][0], motori[i][1], motori[i][2]);
        }
        
        String[][] person_attributes = {
            {"good", "smart", "pretty", "funny"},
            {"bad", "smart", "pretty"},
            {"ugly"}
        };
        for(int i=0; i<person_attributes.length; i++){
            System.out.println("************ Person "+i+" ***********");
            for(int j=0; j<person_attributes[i].length; j++){
                System.out.print(person_attributes[i][j] + "\t");
            }
            System.out.println();
        }
}    
}
