package javaapplication115;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication115 {
    public static void main(String[] args) {
//        Clan repa = new Clan("repa");
//        repa.clan = new Clan("Deda");
//        repa.clan.clan = new Clan("baba");
//        repa.clan.clan.clan = new Clan("unuk");
        List rl = new LinkedList();
        rl.add("Repa");
        rl.add("Deda");
        rl.add("Baba");
        rl.add("Unuk");
        
        //rl.show();
//        String baba = rl.get(2);
//        System.out.println(baba);
//        System.out.println(rl.size());
        Scanner scanner = new Scanner(System.in);
        while(true){
            String unos = scanner.nextLine();
            rl.add(unos);
            for(int i=0; i<rl.size();i++){
                System.out.println(rl.get(i));
            }
        }
    }
    
}
