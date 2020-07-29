package rockpaperscissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static String[] artefacts = {"Rock","Scissors","Paper"};
    static ArrayList stats;
    static void showStats(){
        System.out.println("*******************************************************");
        System.out.printf("%1$-15s%2$-20s%3$-20s%4$-15s%5$-20s%6$-15s%7$-15s\n", "your choice", "computer choice", "result","your wins", "computer wins", "draw games", "total games");
        for (Object st : stats) {
            String[] stat = (String[])st;
            System.out.printf("%1$-15s%2$-20s%3$-20s%4$-15s%5$-20s%6$-15s%7$-15s\n", stat[0], stat[1], stat[2], stat[3], stat[4], stat[5], stat[6]);
        }
    }
    public static void main(String[] args) {
        stats = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String message = "";
        int yw = 0;
        int cw = 0;
        int dg = 0;
        int tg =0;
        System.out.println("Unesite do koliko pobeda igrate");
        int up = scanner.nextInt();
        System.out.println("Unesite ukupan broj igara");
        int ui = scanner.nextInt();
        while(true){ 
            System.out.print("Choose number (0=Rock, 1=Scissors, 2=Paper, 3=Match Statistics): ");
            int your_choice = scanner.nextInt();
            if(your_choice==3){
                showStats();
                continue;
            }
            int computer_choice = random.nextInt(3);
            System.out.println("Your choice: " + artefacts[your_choice] + " ,Computer choice: " + artefacts[computer_choice] );
            if(your_choice+1==computer_choice||(your_choice==2&&computer_choice==0)){
                message = "You won!";
                yw++;
            } else {
                if(your_choice-1==computer_choice||(your_choice==0&&computer_choice==2)){
                    message = "Computer won!";
                    cw++;
                } else {
                    message = "Draw game!";
                    dg++;
                }  
            }
            tg = yw + cw + dg;
            System.out.println(message);
            System.out.println("Your result: " + yw + " Computers result: " + cw);
            stats.add(new String[]{artefacts[your_choice],artefacts[computer_choice],message,Integer.toString(yw),Integer.toString(cw),Integer.toString(dg), Integer.toString(tg)});
            if(yw==up){
                System.out.println("***************************");
                System.out.println("You are the winner!");
                System.out.println("Your result: " + yw + " Computers result: " + cw);
                System.out.println("Game over!!!");
                break;
            }else if(cw==up){
                System.out.println("***************************");
                System.out.println("Computer is winner!");
                System.out.println("Your result: " + yw + " Computers result: " + cw);
                System.out.println("Game over!!!");
                break;
            } else if (tg==ui){
                if(yw>cw){
                    System.out.println("***************************");
                    System.out.println("You are the winner!");
                    System.out.println("Your result: " + yw + " Computers result: " + cw);
                    System.out.println("Game over!!!");
                    break;
                } else if(cw>yw){
                    System.out.println("***************************");
                    System.out.println("Computer is winner!");
                    System.out.println("Your result: " + yw + " Computers result: " + cw);
                    System.out.println("Game over!!!");
                    break;
                }
        }
        }
        showStats();
    }
    
}
