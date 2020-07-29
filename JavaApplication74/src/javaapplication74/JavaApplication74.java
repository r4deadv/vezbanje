package javaapplication74;
public class JavaApplication74 {
    public static void main(String[] args) {
        int i = 0;
//        while(i<10){
//            System.out.println("Dva je manje od tri ("+i+")");
//            i++;
//        }
        while(i<10){
            if(i%2!=0){
                i++;
                continue;
            }
            System.out.println("Broj ("+i+") je paran");
            System.out.println("Ovaj parni broj je stvarno lep");
            System.out.println("Bas obozavam parne brojeve...");
            i++;
        }
    }
    
}
