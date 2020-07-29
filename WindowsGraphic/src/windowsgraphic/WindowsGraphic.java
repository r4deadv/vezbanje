package windowsgraphic;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Panel;

public class WindowsGraphic extends Panel {
    int[][] points = {{20,40},{10,50},{60,60},{30,20},{0,0}};
    
    @Override
    public void paint(java.awt.Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.red);
        for (int[] point : points) {
            g2.fillRect(point[0], point[1], 10, 10);
        }
    }
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.add(new WindowsGraphic());
        f.setSize(300, 300);
        f.setVisible(true);
    }
   
    
}
