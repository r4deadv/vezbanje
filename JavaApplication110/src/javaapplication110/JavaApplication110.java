package javaapplication110;
public class JavaApplication110 {
    public static void main(String[] args) {
        String turnir = "Wimbledon";
        //String output = "";
        StringBuilder output = new StringBuilder();
        for(int i=2016;i<3016;i++){
            output.append(turnir + " " + i + "\n");
        }
        System.out.println(output);
    }
    
}
