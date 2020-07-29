package javaapplication58;
public abstract class BaseObject {
    public String name;
    public Frame frame;
    public BaseObject(String name, Frame frame){
        this.name = name;
        this.frame = frame;
    }
    public abstract void crtaj();
}
