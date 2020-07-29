package checkcarconstructor;

import java.util.Scanner;

public class CheckCarConstructor {
    public static void main(String[] args) {
        String carMake;
        int doors;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite marku automobila");
        carMake = scanner.nextLine();
        
        //ovako je kad se poredi String
        if(carMake.equals("Ford")){
            System.out.println("Unesite broj vrata");
            doors = scanner.nextInt();
            switch(doors){
                case 2:
                    System.out.println("Auto ima 2 vrata.");
                break;
                case 4:
                    System.out.println("Auto ima 4 vrata.");
                break;
                case 5:
                    System.out.println("Auto ima 5 vrata.");
                break;
                default:
                    System.out.println("Ne postoji " + carMake + " sa " + doors + " vrata");
//                    if(doors == 0){
//                        System.out.println("Ne postoji " + carMake + " sa 0 vrata.");
//                     }else{
//                        System.out.println("Ne postoji " + carMake + " sa " + doors + " vrata");
//                    }
                break;
            }
        }else{
            System.out.println("Proizvodjac nije 'Ford'");
        }
        
    }
    
}
