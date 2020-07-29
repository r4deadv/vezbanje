package javaapplication10;

import java.io.Console;

/**
 * @version 1.0
 * @author r4de
 */
public class JavaApplication10 {

    public static void main(String[] args) {
        //console output via Console object 
        Console c = System.console();
        c.writer().println("Hello from Java via console object");
        
        //Output to console, only if console exists         
        Console c1 = System.console();
        if(c1!=null){
            c1.writer().println("Console exist");
        }
        
        Console c2 = System.console();
        c2.writer().println("Enter text here:");
        //Getting data from console
        String line = c2.readLine();
        c2.writer().println("Hello " + line);
    }
    
}
