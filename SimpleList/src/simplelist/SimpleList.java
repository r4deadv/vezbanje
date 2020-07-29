package simplelist;
public class SimpleList {
    public static void main(String[] args) {
        CustomList list = new CustomList();
        for(int i=0; i<100; i++){
            list.add(i*10);
        }
        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Velicina liste: " + list.size());
    }
    
    
}
