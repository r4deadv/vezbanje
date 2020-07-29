package customexceptions2;
public class CustomExceptions2 {
    static int calculate(int a, int b, String op) {
        if(op.equals("+"))
            return a+b;
        if(op.equals("-"))
            return a-b;
        if(op.equals("*"))
            return a*b;
        if(op.equals("/"))
            return a/b;
        return 0;
    }
    public static void main(String[] args) {
        try {
            int x = calculate(5, 0, "/");
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide with 0");
        }
        
        
    }
    
}
