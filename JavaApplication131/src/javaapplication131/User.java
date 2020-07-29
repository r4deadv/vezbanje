package javaapplication131;
public class User {
    public String id;
    public String name;
    public String score;
    
    public static User parse(String score){
        String[] sdata = score.split("-");
        User u = new User();
        u.id = sdata[0];
        u.name = sdata[1];
        u.score = sdata[2]; 
        return u;
}
    }
    

