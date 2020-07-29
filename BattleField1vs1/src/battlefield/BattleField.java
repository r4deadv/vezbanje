package battlefield;

import java.util.Random;
import java.util.Scanner;

public class BattleField {
    public static void main(String[] args) throws InterruptedException {
        GamePlay gameplay = new GamePlay(20);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter position x for player " + PlayerType.Alex + ": ");
            int plrx = scanner.nextInt();
            System.out.print("Enter position y for player " + PlayerType.Alex + ": ");
            int plry = scanner.nextInt();
            gameplay.addPlayer(PlayerType.Alex, plrx, plry);
            System.out.print("Enter position x for player " + PlayerType.Rade + ": ");
            int plax = scanner.nextInt();
            System.out.print("Enter position y for player " + PlayerType.Rade + ": ");
            int play = scanner.nextInt();
            gameplay.addPlayer(PlayerType.Rade, plax, play);
            gameplay.draw();
            do{
                System.out.print("Enter ange Rade: ");
                short radeangle = scanner.nextShort();
                boolean hit = gameplay.shoot(radeangle, PlayerType.Alex);
                gameplay.draw();
                if(hit){
                    System.out.println("You HIT Alex");
                } else{
                    System.out.println("Miss. Alex's turn");
                    Thread.sleep(500);
                    System.out.print("Enter angle Alex: ");
                    int alexangle = scanner.nextInt();
                    hit = gameplay.shoot(alexangle, PlayerType.Rade);
                    gameplay.draw();
                    if(hit){
                        System.out.println("Alex HIT you, you lose!");
                    } else {
                        System.out.println("Miss. Rade's turn");
                    }
                }
            }while(gameplay.gamestate!=GameStates.Finished); //end do 
            System.out.println("****************************");
            System.out.println("Total shoots\t" + gameplay.shoots);
            System.out.println("****************************");
            System.out.println("Another game (y/n)?");
            String another_game = scanner.nextLine();
            if(scanner.nextLine().equals("n")){
                break;
            } else{
                gameplay.reset();
            }
        }//end while game loop
    }
    
}
