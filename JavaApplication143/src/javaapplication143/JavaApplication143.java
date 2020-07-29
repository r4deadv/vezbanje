package javaapplication143;

import java.util.Arrays;
import java.util.List;

public class JavaApplication143 {
    public static void main(String[] args) {
       String tacke = "[{id:10,x:10,y:20},{id:5,x:30,y:40},{id:2,x:2,y:7}]";
       
       List pozicije = UserPosition.parsePoints(tacke);
       for (Object p : pozicije) {
            UserPosition pos = (UserPosition)p;
            System.out.println(pos.userid + " " + pos.point.x + " " + pos.point.y);
       }
    }
    
}
