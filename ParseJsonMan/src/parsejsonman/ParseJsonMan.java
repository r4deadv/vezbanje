package parsejsonman;

import java.util.ArrayList;
import java.util.List;

public class ParseJsonMan {
    public static void main(String[] args) {
        String dobijeni = "[{id:10,x:10,y:20},{id:5,x:30,y:40},{id:2,x:7,y:7}]";
        dobijeni = dobijeni.replace("[{", "");
        dobijeni = dobijeni.replace("}]", "");
        dobijeni = dobijeni.replace("},{", "#");
        
        String[] pozicijeString = dobijeni.split("#");
        List userPositions = new ArrayList();
        for (int i = 0; i < pozicijeString.length; i++) {
            userPositions.add(UserPosition.parse(pozicijeString[i]));
        }
        for (Object up : userPositions) {
            System.out.println(up);
        }
    }
    
}
