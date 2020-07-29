package javaapplication58;
public interface Hitable {
    public void pogodjen(int damage);
    public static void interfaceMethod(){
        System.out.println("Hello");
    }
    default public void instanceMethod(){
        System.out.println("Hello from default method");
    }
}
