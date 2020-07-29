package javaapplication92;

import java.util.Locale;

public class JavaApplication92 {
    public static void main(String[] args) {
        String[][] players = {
            {"1","Peter","Jackson","150.51"},
            {"2","Sally","Jones","232.12"}
        };
        System.out.println("id\tname\tsurname\tbalance");
        for(String[] clan:players){
//            System.out.print(clan[0]+"\t");
//            System.out.print(clan[1]+"\t");
//            System.out.print(clan[2]+"\t");
//            System.out.println(clan[3]+"\t");
            for(int j=0;j<clan.length;j++){
                System.out.print(clan[j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        String[][] motori = {
            {"1","Yamaha R1","22"},
            {"5","Kawasaki Ninja","30"},
            {"10","Suzuki GSXR","4"}
        };
        for(int i=0;i<motori.length;i++){
//            String linija = String.format("Broj: %s, Motor: %s, Pozicija: %s", motori[i][0], motori[i][1], motori[i][2]);
//            System.out.println(linija);
            System.out.printf("Broj: %s, Motor: %s, Pozicija: %s\n", motori[i][0], motori[i][1], motori[i][2]);
        }
    }
    
}
