package displaymatrix;

public class DisplayMatrix {
    public static void main(String[] args) {
        int width = 20, height = 10;
        int [][] points = {{2,4},{1,5},{6,6},{3,2},{0,0}};
        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                boolean nacrtaj = false;
                for (int[] point : points) {
                    if (x == point[0] && y == point[1]) {
                        nacrtaj = true;
                        break;
                    }
                }
                System.out.print(nacrtaj?"x":"o");
//                if(nacrtaj){
//                    System.out.print("x");
//                }else{
//                    System.out.print("o");
//                }
            }
            System.out.println();
        }
    }
}

