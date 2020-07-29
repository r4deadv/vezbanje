package vezbapetlje2;
public class VezbaPetlje2 {
    public static void main(String[] args) throws InterruptedException {
        int x = 0;
        int x1 = 30;
        int right_bound = 40;
        int dir = 1;
        int dir1 = -1;
        while(true){
            for(int i=0; i<right_bound; i++){
                System.out.print((x==i)?"*":(x1==i)?"#":" ");
            }
            x+=dir;
            x1+=dir;
            if(x<0||x>right_bound){
                x*=-1;
            }
            if(x1<0||x1>right_bound){
                x1*=-1;
            }
            System.out.print("\r");
            Thread.sleep(300);
        }
    }
    
}
