package noremainderdivision;
public class NoRemainderDivision {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;
        int remainder = x % y;
        System.out.println("Remainder is " + remainder);
//        if(remainder == 0){
//            System.out.println("Remainder doesn't exist.");
//        }else if(remainder <1000){
//            System.out.println("Remainder is less than 1000.");
//        }else if(remainder >=1000){
//            System.out.println("Remainder is greater than or equal to 1000.");
//        }
        switch(remainder){
            case 0:
                System.out.println("Remainder doesn't exist.");
            break;
            default:
                if(remainder <1000){
                    System.out.println("Remainder is less than 1000.");
                }else {
                    System.out.println("Remainder is greater than or equals to 1000.");
                }
            break;
                
        }        
        }
        
    }
    
