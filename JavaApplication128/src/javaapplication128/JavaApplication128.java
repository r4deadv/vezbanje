package javaapplication128;
public class JavaApplication128 {
    public static void main(String[] args) {
        String turnir = "Wimbledon";
        //String izlaz = "";
        StringBuilder izlaz = new StringBuilder();
        for(int i=2020; i<3020; i++){
        izlaz.append(turnir +" " + i + "\n");
        }
        System.out.println(izlaz);
        
        String username = "Peter";
        String total_score = "250";
        String output = username + " " + total_score;
        System.out.println(output);
        
        String output2 = username.concat(" ".concat(total_score));
        System.out.println(output2);
        
        StringBuilder aj = new StringBuilder();
        aj.append("Aleksandra");
        aj.append(" Janusevska");
        aj.append(" vo");
        aj.append(" Makedonija");
        System.out.println(aj.toString());
    }
    
}
