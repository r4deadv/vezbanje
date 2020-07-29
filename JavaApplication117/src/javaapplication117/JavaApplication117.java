package javaapplication117;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication117 {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while(true){
        String input = scanner.nextLine();
        if(!input.equals("")){
            numbers.add(Integer.parseInt(input));
        } else {
            int sum = 0;
            for(int i=0; i<numbers.size();i++){
                sum+= (int)numbers.get(i);
                System.out.print(numbers.get(i) + " ");
            }
            System.out.println("Result is: " + sum);
        }
        }
        
            
        }
    }
    

