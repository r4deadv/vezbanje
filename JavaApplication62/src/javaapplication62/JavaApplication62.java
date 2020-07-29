package javaapplication62;
public class JavaApplication62 {
    public static void main(String[] args) {
        String txt = "da li pada sneg?";
        
        if(txt == "da li pada sneg?"){
            System.out.println("pada sneg");
            System.out.println("pada sneg jako!");
        }
    
        int x = 10;
        if(x==10){
            System.out.println("x je 10");
        }
        
        double health = 20;
        boolean dead = false;
        health -=25;
        
        if(health<20&&!dead){
            dead = true;
        }
        
        String entered_uname = "peter";
        String entered_pass = "123";
        String stored_uname = "peter";
        String stored_pass = "123";
        
        if(entered_uname==stored_uname&&entered_pass==stored_pass){
            System.out.println("user is valid");
        }
        
}
}
