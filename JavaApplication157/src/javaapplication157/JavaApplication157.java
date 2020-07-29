package javaapplication157;

import java.util.Random;

public class JavaApplication157 {
    
    static void voziMotor() throws CrkoMotorException{
        Random r = new Random();
        boolean motorPokvaren = r.nextBoolean();
        if(!motorPokvaren){
            System.out.println("Vozim motor");
        }else{
            System.out.println("Motor je pokvaren");
            CrkoMotorException pokvarenMotor = new CrkoMotorException();
            throw pokvarenMotor;
        }
    }
    
    static void voziTrku() throws Exception, MaglaException, CrkoMotorException{
        Random r = new Random();
        int fogPercentage = r.nextInt(5);
        int sati = r.nextInt(10);
        if(sati<5){
            throw new Exception();
        }
        if(fogPercentage<3){
            System.out.println("Ok je nema magle, vozi!!!");
            voziMotor();
            if(r.nextBoolean()){
                throw new BombaNaStazi();
            }
        }else{
            throw new MaglaException();
        }
    }
    
    public static void main(String[] args){
      
        try{
            voziTrku();
        } catch(MaglaException ex) {
            System.out.println("Trka se otkazuje zbog magle");
        } catch(CrkoMotorException ex){
            System.out.println("Motor je crkao, sklonite ga sa staze i idemo dalje");
        } catch(Exception ex){
            System.out.println("Nesto se trece dogodilo, nemamo pojma sta je");
        } finally{
            System.out.println("Proba finally bloka");
        }
    }
    
}
