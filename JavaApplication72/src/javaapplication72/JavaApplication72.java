package javaapplication72;
public class JavaApplication72 {
    public static void main(String[] args) throws InterruptedException {
//        for(int i=1;i<11;i++){
//            for(int j=1;j<4;j++){
//                System.out.println("Pozdrav iz unutrasnje petlje("+j+" )");
//            }
//            System.out.println("Cao iz petlje ("+i+")");
//        }
        int w = 20;
        int h = 10;
        for(int j=0;j<h;j++){
            for(int i=0;i<w;i++){
                if(j==0||j==(h-1)||i==0||i==(w-1) ){
                    System.out.print("#");
                }else
                     System.out.print("o");
        }
            System.out.println("");
        }
    }
    
}
