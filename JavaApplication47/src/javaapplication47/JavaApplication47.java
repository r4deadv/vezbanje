package javaapplication47;
public class JavaApplication47 {
    public static void main(String[] args) {
        Rucak r = new Rucak();
        r.naziv = "Spageti";
        r.ocena = 10;
        r.slano = true;
        System.out.println("Naziv: " + r.naziv);
        System.out.println("Ocena: " + r.ocena);
        System.out.println("Slano: " + r.slano);
        
        Person person = new Person();
        person.name = "Peter";
        person.surname = "Jackson";
        person.age = 50;
        person.height = 176;
        person.weight = 80;
        
        TankCrewPerson tc_person = new TankCrewPerson();
        tc_person.experience = 57;
        tc_person.category = 1;
        tc_person.vehicle_id = 5;
        tc_person.name_and_surname = "Yefreytor Vadim Vasilyev";
        
    }
    
}
