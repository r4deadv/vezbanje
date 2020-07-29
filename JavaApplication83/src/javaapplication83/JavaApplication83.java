package javaapplication83;
public class JavaApplication83 {
    public static int happening(int num){
        if(num==1){
            return 1;
        } else{
            return happening(num-1)+num;
        }    
    }
    public static void main(String[] args) {
        System.out.println(happening(4));
    }
    
}
