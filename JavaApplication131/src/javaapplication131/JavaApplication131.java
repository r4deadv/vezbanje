package javaapplication131;

import java.util.Arrays;

public class JavaApplication131 {
    public static void main(String[] args) {
        
        User u = User.parse("1-Peter-150");
        User u1 = User.parse("2-Mike-100");
        User u2 = User.parse("3-Scot-300");
        
        System.out.println(u.name);
        System.out.println(u1.name);
        
//        String score = "1-Peter-150";
//        String[] sdata = score.split("-");
//        User u = new User();
//        u.id = sdata[0];
//        u.name = sdata[1];
//        u.score = sdata[2];
//        
//        System.out.println(Arrays.toString(sdata));
//        for(String s : sdata){
//            System.out.println(s);
//        }
        
    }
    
}
