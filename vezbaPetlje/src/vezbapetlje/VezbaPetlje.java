package vezbapetlje;

import java.util.Random;

public class VezbaPetlje {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int x = 0;
        
        int dir = 1;
        while(true){
            int right_bound = r.nextInt(100);
            for(int i=0; i<right_bound; i++){
                System.out.print((x==i)?"*":" ");
            }
            x+=dir;
            if(x<0||x>=right_bound){
                dir*=-1;
            }
            System.out.print("\r");
            Thread.sleep(50);
        }
        
    }
    
}
