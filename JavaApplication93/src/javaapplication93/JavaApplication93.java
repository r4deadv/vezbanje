package javaapplication93;
public class JavaApplication93 {
    public static void main(String[] args) {
        String[][] person_attributes = {
            {"good","smart","pretty","funny"},
            {"bad","smart","pretty"},
            {"ugly"}
        };
        for(int i=0;i<person_attributes.length;i++){
            System.out.println("********* Person "+i+" *********");
            for(int j=0;j<person_attributes[i].length;j++){
                System.out.print(person_attributes[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
