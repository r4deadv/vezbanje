package displaymatrix2;
public class DisplayMatrix2 {
    public static void main(String[] args) throws InterruptedException {
        
//        0xxx0
//        x000x 
//        0xxx0
        
    int[][] krug = {{1,0},{2,0},{3,0},{0,1},{4,1},{1,2},{2,2},{3,2}};
    int[] offset = {5,5};
    
    int[] vel = {1,1};
    int w=50, h=10;
    while(true){
        offset[0]+=vel[0];
        offset[1]+=vel[1];
        if(offset[0]>w || offset[0]<0){
            vel[0]*=-1;
        }
        if(offset[1]>h || offset[1]<0){
            vel[1]*=-1;
        }
        for(int y=0;y<h;y++){
            for(int x=0;x<w;x++){
                boolean nacrtaj = false;
                for(int i=0;i<krug.length;i++){
                    if(x==krug[i][0]+offset[0] && y==krug[i][1]+offset[1]){
                        nacrtaj = true;
                        break;
                    }
                }
                if(nacrtaj){
                    System.out.print("#");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            }
        Thread.sleep(250);
    }
    }
    }
    

