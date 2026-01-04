package Interface;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

public class Bar extends JComponent{

    public Bar(){
        super();
    }

    public void paintComponent(Graphics g, Color barColor, int x, int y, int width, int height){
        super.paintComponent(g);
        g.setColor(barColor);
        g.drawRect(x, y, width, height);
        g.fillRect(x, y, width, height);
    }
}
