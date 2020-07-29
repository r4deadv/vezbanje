package kartice;
public class Card {
    double balance;
    public Card(double balance){
        this.balance = balance;
    }
    public void charge(double amount){
        if(balance>=amount){
            System.out.println("Transakcija je izvrsena i ostalo je " + (balance-=amount) + " dinara na racunu");
        } else {
            System.out.println("Nema dovoljno novca na racunu");
        }
        }
    }
