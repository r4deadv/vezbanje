package inheritance;
public class Professor extends Person {
    public String className;
    public Professor(String firstName, String lastName, String className){
        super(firstName, lastName);
        this.className = className;
    }
    @Override
    public void show(){
        System.out.println("Professor " + firstName + " " + lastName + " " + className);
    }
    public String toString(){
        return "Zdravo iz professora";
    }
}
