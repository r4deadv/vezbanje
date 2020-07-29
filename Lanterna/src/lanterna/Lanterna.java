package lanterna;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;


public class Lanterna {
    public static void main(String[] args) {
    int[][] krug = {{1,0},{2,0},{3,0},{0,1},{4,1},{1,2},{2,2},{3,2}};
    int[] offset = {5,5};
    
    Terminal terminal = TerminalFacade.createCygwinTerminal();
    Screen screen = TerminalFacade.createScreen();
    screen.startScreen();
    
    while(true){
        screen.clear();
        Key k = screen.readInput();
            if(k!=null){
                if(k.getKind()==Kind.ArrowLeft){
                    offset[0]--;
                } else
                if(k.getKind()==Kind.ArrowRight){
                    offset[0]++;
                } else
                if(k.getKind()==Kind.ArrowDown){
                    offset[1]++;
                } else
                if(k.getKind()==Kind.ArrowUp){
                    offset[1]--;
                }
        }
    
        for (int[] tacka : krug) {
            screen.putString(tacka[0]+offset[0], tacka[1]+offset[1], "*", Terminal.Color.RED, Terminal.Color.BLACK, ScreenCharacterStyle.Bold);
        }
    screen.refresh();
    }
    }
    
}
