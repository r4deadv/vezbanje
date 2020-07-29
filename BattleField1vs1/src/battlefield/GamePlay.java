package battlefield;

import java.util.ArrayList;

public class GamePlay {
    public GameStates gamestate;
    public int shoots;
    Point rade;
    Point alex;
    int matrix_size = 10;
    ArrayList trajectory;
    
    public GamePlay(int matrix_size){
        this.matrix_size = matrix_size;
        trajectory = new ArrayList();
        gamestate = GameStates.Uninitialized;
        shoots = 0;
    }
    public void addPlayer(PlayerType pttype){
        addPlayer(pttype,0,0);
    }
    public void addPlayer(PlayerType pttype, int x, int y){
        switch(pttype){
            case Rade:
                rade = new Point(x, y);
            break;
            case Alex:
                alex = new Point(x,y);
                gamestate = GameStates.Running;
            break;
        }
    }
    public void reset(){
        this.shoots = 0;
        trajectory.clear();
        gamestate = GameStates.Uninitialized;
    }
    public boolean shoot(int angle, PlayerType trgt){
        Point source, target;
        if(trgt==PlayerType.Alex){
            shoots++;
            source = rade;
            target = alex;
        } else{
            source = alex;
            target = rade;
        }
        double radians = angle*Math.PI/180;
        int speed =1;
        double x = source.x, y = source.y;
        trajectory.clear();
        trajectory.add(new Point((int)x, (int)y));
        int counter = 0;
        while(true){
            x+=speed*Math.cos(radians);
            y+=speed*Math.sin(radians);
            if((int)x==target.x&&(int)y==target.y){
                this.gamestate = GameStates.Finished;
                return true;
            }
            if((int)x<=0||(int)x>matrix_size||(int)y<=0||(int)y>matrix_size){
                return false;
            }
            trajectory.add(new Point((int)x, (int)y));
        }//end while
    }//end shoot()
    public void draw(){
        for(int h=0; h<matrix_size; h++){
            for(int w=0; w<matrix_size; w++){
                if(rade!=null&&h==rade.y&&w==rade.x){
                    System.out.print("R");
                } else
                if(alex!=null&&h==alex.y&&w==alex.x){
                    System.out.print("A");
                } else{
                    if(h==0||h==matrix_size-1||w==0||w==matrix_size-1){
                        System.out.print("0");
                    } else{
                        boolean point_draw = true;
                        for (Object pto : trajectory) {
                            Point pt = (Point)pto;
                            if(pt.x==w&&pt.y==h){
                                System.out.print("*");
                                point_draw = false;
                            }
                        }
                        if(point_draw){
                            System.out.print(" ");
                        }
                    }
                }
            }//end unutrasnji for(w)
            System.out.println();
        }//end spoljasnji for(h)
    }//end draw()
}
