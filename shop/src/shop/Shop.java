package shop;
public class Shop {
    public static void main(String[] args) {
        Chocolate najlepsezelje = new Chocolate("Najlepse zelje", "0123456789",150, 200);
        najlepsezelje.getCena();
        Wine tamjanika = new Wine("Tamjanika", "025587331", 500, 0.75);
        tamjanika.getCena();
        System.out.println(najlepsezelje);
        System.out.println(tamjanika); 
        System.out.println("tamjanika osnovna cena: " + tamjanika.osnovnaCena);
        System.out.println("tamjanika cena: " + tamjanika.cena);
        System.out.println("tamjanika konacna cena: " + tamjanika.konacnaCena);
}
}
