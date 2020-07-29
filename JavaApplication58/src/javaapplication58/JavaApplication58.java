package javaapplication58;
public class JavaApplication58 {
    public static void main(String[] args) {
        Spaceship serenity = new Spaceship("Serenity", 3, 100, 12, 20, 50,new Frame(0, 0, 100, 30));
        Enemy enemy = new Enemy("Sajlonac", 110, 5, 20, 100, new Frame(0,0,80,20));
        Ikar ikar = new Ikar();
       
        
        enemy.pogodak(serenity);
        enemy.pogodak(ikar); 
        
        enemy.stun(ikar);
        enemy.stun(serenity);
    }
}
