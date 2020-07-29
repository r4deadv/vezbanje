package parsejsonman;
public class UserPosition {
    public int userid;
    public UserPoint position;
    
    public static UserPosition parse(String dobijeni){
        UserPoint uPoint = new UserPoint();
        UserPosition uPos = new UserPosition();
        String[] pozicije = dobijeni.split(",");
        uPos.userid = Integer.parseInt(pozicije[0].split(":")[1]);
        uPoint.x = Float.parseFloat(pozicije[1].split(":")[1]);
        uPoint.y = Float.parseFloat(pozicije[2].split(":")[1]);
        uPos.position = uPoint;
        return uPos;
    }
    @Override
    public String toString(){
        return "id: " + this.userid + " x: " + this.position.x + " y: " + this.position.y;
    }
}
