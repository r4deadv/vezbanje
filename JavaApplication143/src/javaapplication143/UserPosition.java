package javaapplication143;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserPosition {
    public UserPoint point;
    public int userid;
    
    public static List parsePoints(String tacke){
        List res = new ArrayList();
        tacke = tacke.replace("[{", "");
        tacke = tacke.replace("}]", "");
        String[] tackeArr = tacke.split("\\},\\{");
        for (String tacka : tackeArr) {
            res.add(UserPosition.parse(tacka));
        }
        return res;
    }
    
    public static UserPosition parse(String tacka){
        UserPosition res = new UserPosition();
        String[] tackaArr = tacka.split(",");
        int id = Integer.parseInt(tackaArr[0].split(":")[1]);
        float x = Float.parseFloat(tackaArr[1].split(":")[1]);
        float y = Float.parseFloat(tackaArr[2].split(":")[1]);
        res.userid = id;
        res.point = new UserPoint();
        res.point.x = x;
        res.point.y = y;
        return res;
    }
}
