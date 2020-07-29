package customexceptions;
public class CustomExceptions {
    static void throwingUnchecked(){
        throw new MyUncheckedException();
    }
    static void throwingChecked() throws MyException{
        throw new MyException();
    }
    public static void main(String[] args) {
        throwingUnchecked();
        try {
            throwingChecked();
        } catch (Exception ex) {
            System.out.println("Uhvatio MyException");
        }
        try {
            throw new MyException();
        } catch (Exception ex) {
            System.out.println("Hey, this is the same as regular Exception");
            System.out.println("Custom exception text: " + ex);
        }
    }
    
}
