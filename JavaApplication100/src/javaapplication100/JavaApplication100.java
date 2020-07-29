package javaapplication100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication100 {
    public static void main(String[] args) {
        String[] igraci = {"Vlada"};
        igraci = Arrays.copyOf(igraci, igraci.length+1);
        igraci[igraci.length-1] = "Pera";
        System.out.println(Arrays.toString(igraci));
        
        igraci = Arrays.copyOf(igraci, igraci.length+1);
        igraci[igraci.length-1] = "Laza";
        System.out.println(Arrays.toString(igraci));
        
        //RadovaLista rl = new RadovaLista();
        //List rl = new ArrayList();
        List rl = new LinkedList();
        rl.add("Repa");
        rl.add("Deda");
        rl.add("Baba");
        rl.add("Unuk");
        
        //rl.show();
        
//        Object baba = rl.get(2);
//        System.out.println(baba);
//        System.out.println("Ima komada: " + rl.size());
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String unos = sc.nextLine();
            rl.add(unos);
            for(int i=0;i<rl.size();i++){
                System.out.println(rl.get(i));
            }
        }
        
       // rucno
//        Clan repa = new Clan("repa");
//        repa.clan = new Clan("Deda");
//        repa.clan.clan = new Clan("Baba");
//        repa.clan.clan.clan = new Clan("Unuk");
        
       //   malo automatizovano
//        Clan repa = new Clan("repa");
//        Clan glava = repa;
//        while(glava.clan!=null){
//            glava = glava.clan;
//        }
//        glava.clan = new Clan("Deda");
//        
//        glava = repa;
//        while(glava.clan!=null){
//            glava = glava.clan;
//        }
//        glava.clan = new Clan("Baba");
    }
    
}
