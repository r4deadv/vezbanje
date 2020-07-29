package javaapplication58;
public class Spaceship extends FlyingObject implements Hitable, IStun {
    public int lives;
    public int rockets;
    public int damage;
    public int health;
    public Spaceship(String name, int lives, int speed, int rockets, int damage, int health, Frame frame){
        super(name, speed, frame);
        this.lives = lives;
        this.rockets = rockets;
        this.damage = damage;
        this.health = health;
    }

    @Override
    public void crtaj() {
        System.out.println("~>=");
    }
    
    @Override
    public void pogodjen(int damage){
        this.health -= damage;
        System.out.println(this.health);
    }
    
    public void pogodio(Hitable h){
        h.pogodjen(damage);
    }

    @Override
    public void stun(int time) {
        System.out.println("Ja imam curse, i kod mene je stun *2 ("+ time*2+")");
    }
        
}
