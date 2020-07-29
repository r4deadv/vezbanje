package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2014");
        Professor professor = new Professor("Edward", "Owen", "Java Programing");
        
        person.show();
        student.show();
        professor.show();
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(professor);
        
        student.show();
        student.show("Dusko");
        student.show("Dusko", "Dugousko");
    }
    
}
