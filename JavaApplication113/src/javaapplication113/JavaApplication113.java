package javaapplication113;
public class JavaApplication113 {
    public static void main(String[] args) throws InterruptedException {
        int width = 20, height = 10;
        int[][] points = {{2,4},{1,5},{6,6},{3,2},{0,0}};
        int[][] krug = {{1,0},{2,0},{3,0},{0,1},{4,1},{1,2},{2,2},{3,2}};
        int[] offset = {5,5};
        int[] vel = {1,1};
        
        while(true){
            offset[0] += vel[0];
            offset[1] += vel[1];
            if(offset[0]>=width || offset[0]<=0){
                vel[0]*=-1;
            }
            if(offset[1]>=height || offset[1]<=0){
                vel[1]*=-1;
            }
            for(int y=0; y<height; y++){
                for(int x=0; x<width; x++){
                    boolean nacrtaj = false;
                    for(int i=0; i<krug.length; i++){
                        if(x==krug[i][0] + offset[0] && y==krug[i][1] + offset[1]){
                            nacrtaj = true;
                            break;
                        }
                    }
                    if(nacrtaj)
                        System.out.print("#");
                    else
                        System.out.print("o");
                }
                System.out.println();
            }
            Thread.sleep(250);
        }
    }
    
}
