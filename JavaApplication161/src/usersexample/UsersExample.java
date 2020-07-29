package usersexample;
public class UsersExample {
    public static void main(String[] args) {
        try {
            User korisnik = new User(101, "Aleksandra", "Janusevska", "aj@gmail.com");
            System.out.println(korisnik);
        } catch (InvalidIdException ex) {
            System.out.println("Nepravilan ID");
        } catch (InvalidFirstNameException e) {
            System.out.println("Nepravilno ime");
        } catch (InvalidLastNameException e) {
            System.out.println("Nepravilno prezime");
        } catch (InvalidEmailException e) {
            System.out.println("Nepravilan e-mail");
        }
        
    }
    
}
