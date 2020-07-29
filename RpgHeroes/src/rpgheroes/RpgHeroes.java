package rpgheroes;
public class RpgHeroes {
    public static void main(String[] args) {
        DwarfWarrior dw = new DwarfWarrior(100, 100, false);
        ElfMage em = new ElfMage(120, 100, false);
        dw.receiveHit();
        em.receiveHit();
        em.show();
        dw.show();
        dw.secondaryFire();
        em.secondaryFire();
        dw.show();
        dw.primaryFire();
        dw.receiveHit();
        dw.show();
        em.show();
        dw.areaOfEffectHit();
        dw.show();
        dw.secondaryFire();
    }
    
}
 