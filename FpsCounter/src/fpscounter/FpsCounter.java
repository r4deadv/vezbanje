package fpscounter;
public class FpsCounter {
    static int fps = 0;
    static void tick(){
        System.out.print("Current fps: " + fps + "\r");
    } 
    public static void main(String[] args) {
        float targetFps = 60.0f;
        float estimatedInterval = 1000.0f/targetFps;
        long lastTime = System.currentTimeMillis(),currentTime = lastTime, lastSecond = lastTime;
        int currFrame = 0;
        while(true){
            currentTime = System.currentTimeMillis();
            if((currentTime-lastTime)>=estimatedInterval){
                currFrame++;
                tick();
                lastTime = currentTime;
            }
            if((currentTime-lastSecond)>=1000){
                fps = currFrame;
                currFrame = 0;
                lastSecond = currentTime;
            }
        }
    } 
}
