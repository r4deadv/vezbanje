package javaapplication71;
public class JavaApplication71 {
    public static void main(String[] args) throws InterruptedException {
//        for(int brojac=0;brojac<300;brojac++){
//            System.out.println(brojac);
//        }
        int konacanBrojZvezdica = 25;
        for(int i=0;i<konacanBrojZvezdica;i++){
            System.out.print("*");
        }
        System.out.println("\n#\t1\t2\t3");
        System.out.println("*************************");
        for(int i=1; i<11; i++){
//            System.out.print(i + "\t");
//            System.out.print(1*i + "\t");
//            System.out.print(2*i + "\t");
//            System.out.print(3*i + "\t" + "\n");
            System.out.println(i+"\t"+(i*1)+"\t"+(i*2)+"\t"+(i*3));
        }
        }
    }
    

