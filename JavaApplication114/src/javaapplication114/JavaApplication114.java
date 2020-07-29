package javaapplication114;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;

public class JavaApplication114 {
    public static void main(String[] args) throws InterruptedException {
        int width = 20, height = 10;
        int[][] krug = {{1,0},{2,0},{3,0},{0,1},{4,1},{1,2},{2,2},{3,2}};
        int[] offset = { 3,3};
        int[] vel = {1,1};
        int[] auto = {5,5};
        
        Terminal terminal = TerminalFacade.createTerminal();
        Screen screen = TerminalFacade.createScreen(terminal);
        screen.startScreen();
        
        while(true){
        screen.clear();
        auto[0] += vel[0];
        auto[1] += vel[1];
        if(auto[0]>20|| auto[0]<0){ vel[0] *=-1;}
        if(auto[1]>30 || auto[1]<0){ vel[1] *=-1;}
        Key key = screen.readInput();
        if(key!=null){
            if(key.getKind()==Kind.ArrowLeft){
                offset[0]--;
            } else
            if(key.getKind()==Kind.ArrowRight){
                offset[0]++;
            } else
            if(key.getKind()==Kind.ArrowDown){
                offset[1]++;
            } else
            if(key.getKind()==Kind.ArrowUp){
                offset[1]--;
            }
        }
        for(int[] tacka : krug){
            screen.putString(tacka[0]+offset[0], tacka[1]+offset[1], "*", Terminal.Color.RED, Terminal.Color.BLACK, ScreenCharacterStyle.Bold);
        }
        screen.putString(0+auto[0], 0+auto[1], "#", Terminal.Color.BLUE, Terminal.Color.BLACK, ScreenCharacterStyle.Bold);
        screen.refresh();
        Thread.sleep(250);
        }
        
        
        
    }
    
}
