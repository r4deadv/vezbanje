package javaapplication151;
public enum FullGameState {
    Running(1,"Game is running"),Paused(2,"Game is paused"),Stopped(3,"Game is stopped");
    
    public int state_id;
    public String state_description = "This is some state";

    private FullGameState(int id, String desc) {
        this.state_id = id;
        this.state_description = desc;
    }
    
    
}
