package javaapplication63;
public class JavaApplication63 {
    public static void main(String[] args) {
        int padova = 3;
        boolean pad = false;
        
        if(pad){
            padova --;
            System.out.println("Pao je igrac, podizemo igraca");
            pad = false;
        } else if(padova<1) {
            System.out.println("Mrtav covek vozi bicikl");
        } else {
            System.out.println("Samo ti vozi");
        }
        
    }
}
