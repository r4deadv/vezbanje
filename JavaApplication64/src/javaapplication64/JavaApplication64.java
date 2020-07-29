package javaapplication64;
public class JavaApplication64 {
    public static void main(String[] args) {
        boolean gameOver;
        int brojZivota = 0;
        
//        if(brojZivota==0){
//            gameOver = true;
//        } else {
//            gameOver = false;
//        }
        gameOver = brojZivota==0 ? true : false;
        
        int x = 10;
        int y = 20;
        int z = (x>10) ? x:y;
        System.out.println(z);
    }  
}
