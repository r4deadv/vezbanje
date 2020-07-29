package javaapplication150;

import java.util.Scanner;

public class JavaApplication150 {
    final static int KONJ = 2;
    final static int LOVAC =3;
    
    public static void main(String[] args) {
        int obabranaFigura = LOVAC;
               
        Figure odigranaFigura = Figure.Kraljica;
        //odigranaFigura.broj = 2;
        //Figure odigranaFigura = Figure.valueOf("Kraljica"); 
        //Figure odigranaFigura = Figure.valueOf(new Scanner(System.in).nextLine());
        
//        if(odigranaFigura==Figure.Konj){
//            System.out.println("Odigrao je konja");
//        }
        switch(odigranaFigura){
            case Konj:
                System.out.println("Odigrao je konja na h3");
                System.out.println(Figure.Konj.broj);
                System.out.println(Figure.Konj.oznaka);
                break;
            case Lovac:
                System.out.println("Odigrao je lovca na g4");
                System.out.println(Figure.Lovac.broj);
                System.out.println(Figure.Lovac.oznaka);
                break;
            case Kraljica:
                System.out.println("Odigrao je kraljicu na h5");
                System.out.println(Figure.Kraljica.broj);
                System.out.println(Figure.Kraljica.oznaka);
                break;
        }
        
        BrickStatus bs = BrickStatus.Untouched;
        
        //mario udara u ciglu
        //ako je netaknut
        switch(bs){
            case Untouched:
                System.out.println("Udarac izbacuje pare!!!");
                break;
            case Cracked:
                System.out.println("Napukao je i sada je unisten");
                break;
            case Destroyed:
                System.out.println("Nista se ne dogadja jer je vec unisten");
                break;
        }
    }
    
}
