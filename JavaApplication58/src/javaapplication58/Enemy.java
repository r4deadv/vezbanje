package javaapplication58;
public class Enemy extends FlyingObject {
    public int rockets;
    public int damage;
    public int health;
    public int stunTime;
    
    public Enemy(String name, int speed, int rockets, int damage, int health, Frame frame){
        super(name, speed, frame);
        this.rockets = rockets;
        this.damage = damage;
        this.health = health;
        this.stunTime = 4;
    }
    public void pogodak(Hitable pogodjeni){
        pogodjeni.pogodjen(this.damage);
    }
    public void stun(IStun pogodjeni){
        pogodjeni.stun(this.stunTime);
    }
    
    @Override
    public void crtaj(){
        System.out.println("|*|");
    }
}
