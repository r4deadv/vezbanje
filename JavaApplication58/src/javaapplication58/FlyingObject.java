package javaapplication58;
public abstract class FlyingObject extends BaseObject {
   public int speed;
   public FlyingObject(String name, int speed, Frame frame){
       super(name, frame);
       this.speed = speed;
   }
}
 