package battlefield;

import java.util.Random;
import java.util.Scanner;

public class BattleField {
    public static void main(String[] args) throws InterruptedException {
        GamePlay gameplay = new GamePlay(20);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter position x: ");
            int plx = scanner.nextInt();
            System.out.print("Enter position y: ");
            int ply = scanner.nextInt();
            gameplay.addPlayer(PlayerType.Man, plx, ply);
            gameplay.addPlayer(PlayerType.Computer);
            gameplay.draw();
            do{
                System.out.print("Enter ange: ");
                short angle = scanner.nextShort();
                boolean hit = gameplay.shoot(angle, PlayerType.Computer);
                gameplay.draw();
                if(hit){
                    System.out.println("You HIT computer");
                } else{
                    System.out.println("Miss. Computer turn");
                    Thread.sleep(2000);
                    int compangle = new Random().nextInt(361);
                    hit = gameplay.shoot(compangle, PlayerType.Man);
                    gameplay.draw();
                    System.out.println("Computer angle " + compangle);
                    if(hit){
                        System.out.println("Computer HIt you, you lose!");
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
