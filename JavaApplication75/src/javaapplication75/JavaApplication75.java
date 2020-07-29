package javaapplication75;

import java.util.Random;

public class JavaApplication75 {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int motor = 0;
        int cilj = 10;
        Random r = new Random();
        
         
        trka:
        while(true){
            System.out.println("Pocinje trka!!!");
            motor = 0;
            while(true ){
                motor++;
                System.out.println("Motor je na krugu " + motor);
                if(r.nextInt(10)==3){
                    System.out.println("Razbio se motor");
                    break trka;
                }
                if(motor>=cilj){
                    System.out.println("Stigao je na cilj!!!");
                    break;
                }
                Thread.sleep(300);
            }
            System.out.println("Kraj trke!!!");
            //Thread.sleep(300);
        }
        System.out.println("Zavrsio si sa trkanjem momak!");
    } 
}
