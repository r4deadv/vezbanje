package rpgheroes;
public class ElfMage extends BaseHero {
    public ElfMage(double health, double mana, boolean dead){
        super(health, mana, dead);
    }

    @Override
    public void receiveHit() {
        this.health -= 30;
        this.dead = this.health<=0;
    }

    @Override
    public void primaryFire() {
        this.mana -= 15;
        System.out.println("Firig primary!!!");
    }

    @Override
    public void secondaryFire() {
        this.mana -= 50;
        System.out.println("Firing secondary!!!");
    }
    public void show(){
        System.out.println("Elf Mage" + "\n" + "Health: " + this.health + "\n" + "Mana: " + this.mana + "\n" + "Dead: " + this.dead);
    }
    
}
