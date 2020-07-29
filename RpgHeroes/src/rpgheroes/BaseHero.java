package rpgheroes;
public abstract  class BaseHero {
    double health, mana;
    boolean dead;
    public BaseHero(double health, double mana, boolean dead){
        this.health = health;
        this.mana = mana;
        this.dead = dead;
    }
    public void areaOfEffectHit(){
        receiveHit();
    }
    public abstract void receiveHit();
    public abstract void primaryFire();
    public abstract void secondaryFire();
}
