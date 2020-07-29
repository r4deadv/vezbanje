package javaapplication67;
public class JavaApplication67 {
    public static void main(String[] args) {
        int tipMotocikla = 3;
        
//       if(tipMotocikla == 1){
//            System.out.println("Ovo je skuter");
//        } else if(tipMotocikla == 2){
//            System.out.println("Ovo je trkacki motor");
//        } else if(tipMotocikla == 3){
//            System.out.println("Ovo je kros");
//        } else{
//            System.out.println("Ovo je bicikl, nije motor");
//        }
        switch(tipMotocikla){
            case 1:
                System.out.println("Ovo je skuter");
            break;
            case 2:
                System.out.println("Ovo je trkacki");
            break;
            case 3:
                System.out.println("Ovo je kros");
            break;
            case 4:
                System.out.println("Enduro");
            break;
            default:
                System.out.println("Ovo ne znam sta je");
            break;
        }
        }
        
    }
    
