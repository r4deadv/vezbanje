package sortusers;
public class User {
    public int id;
    public String name;
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int compareTo(Object o) {
        User comparer = (User)o;
        if(comparer.id>this.id){
            return -1;
        } else if (comparer.id<this.id) {
            return 1;
        } else {
            return 0;
        }
    }
            
}
