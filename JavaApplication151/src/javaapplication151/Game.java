package javaapplication151;

import java.util.EnumSet;

public class Game {
    public static final int RUNNING =1;
    public static final int PAUSED = 2;
    public static final int STOPPED = 3;
    
    public static void main(String[] args) {
        
        GameState state = GameState.Paused;
        switch(state){
            case Stopped:
                System.out.println("The game is stopped.");
                break;
            case Paused:
                System.out.println("The game is paused.");
                break;
            case Running:
                System.out.println("The game is running");
                break;
        }
        
        int gameStatus = Game.RUNNING;
        switch(gameStatus){
            case STOPPED:
                System.out.println("The game is stoped");
                break;
            case PAUSED:
                System.out.println("The game is paused");
                break;
            case RUNNING:
                System.out.println("The game is running");
                break;
        }
        BattleType battle = BattleType.Special;
        
        switch(battle){
            case Random:
                System.out.println("This is random battle");
                break;
            case Team:
                System.out.println("This is random battle");
                break;
            case TankCompany:
                System.out.println("This is Tank Company Battle");
                break;
            case Special:
                System.out.println("This is Special Battle");
                break;
        }
        
        String persisted_state = "Running";
        GameState recovered = GameState.valueOf(persisted_state);
        System.out.println("Game state is " + recovered);
        
        System.out.println("Available game states");
        for (GameState gs : GameState.values()) {
            System.out.println("State: " + gs);
        }
        
        System.out.println("Range of game states");
        EnumSet states_range = EnumSet.range(GameState.Paused, GameState.Stopped);
        for (Object st : states_range) {
            System.out.println("State range: " + st);
        }
        
        FullGameState fg_state = FullGameState.Running;
        System.out.println(fg_state.state_description);
        System.out.println(fg_state.state_id);
    }
    
}
