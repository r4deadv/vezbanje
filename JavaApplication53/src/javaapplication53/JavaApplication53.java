package javaapplication53;
public class JavaApplication53 {
    public static void passByValue (int x){
        x = 25;
    }
    public static void passByReference (Car car){
        car.model = "Beetle";
    }
    public static int useVarargs (int... operands)  {
        int result = 0;
        for(int i=0;i<operands.length;i++){
            result+=operands[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 10;
        passByValue(x);
        System.out.println(x);
        
        Car car = new Car();
        car.model = "Renault 4";
        passByReference(car);
        System.out.println(car.model);
        
        System.out.println(useVarargs(1,5,12));
    }
    
}
