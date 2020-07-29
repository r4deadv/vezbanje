package javaapplication132;

import java.util.ArrayList;

public class JavaApplication132 {
    static String cleanIncoming(String incoming){
        incoming = incoming.replace("[{", "");
        incoming = incoming.replace("}]", "");
        incoming = incoming.replace("},{", "#");
        return incoming;
    }
    public static void main(String[] args) {
        
      String incoming = "[{id:10,x:10,y:20},{id:5,x:30,y:40},{id:2,x:7,y:7}]";
      ArrayList userPositions = new ArrayList();
      String cleanUsers = cleanIncoming(incoming);
      String[] usersStrings = cleanUsers.split("#");
      for(int i=0; i<usersStrings.length; i++){
          userPositions.add(UserPosition.parse(usersStrings[i]));
      }
      for(Object up : userPositions){
          System.out.println(up);
      }
    }
    
}
