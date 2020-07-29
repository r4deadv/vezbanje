package rpgheroes;
public class DwarfWarrior extends BaseHero {
    public DwarfWarrior(double health, double mana, boolean dead){
        super(health, mana, dead);
    }
    
    @Override
    public void receiveHit() {
        this.health -= 10;
        this.dead = this.health<=0;
    }
    
    @Override
    public void primaryFire() {
        this.mana -= 5;
        System.out.println("Firing primary!!!");
    }

    @Override
    public void secondaryFire() {
        this.mana -= 10;
        System.out.println("Firing secondary!!!");
        show();//moze i odamah da se pokaze ucinak
    }
    
    public void show(){
        System.out.println("Dwarf Warrior" + "\n" + "Health: " + this.health + "\n" + "Mana: " + this.mana + "\n" + "Dead: " + this.dead);
    }
    
}
