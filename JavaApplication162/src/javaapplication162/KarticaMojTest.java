package javaapplication162;
public class KarticaMojTest {
    public void platiPorezTest(){
        System.out.println("Testiraj platiPorez()");
        Kartica k = new Kartica();
        int suma = 40;
        int ocekivano = 20;
        int dobijeno = k.platiPorez(suma);
        if(ocekivano!=dobijeno){
            System.out.println("Greska bato");
        }else{
            System.out.println("Metod radi");
        }
    }
}
