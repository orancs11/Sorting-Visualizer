package Interface;

import javax.swing.JComponent;
import java.awt.*;

public class Bar extends JComponent{
    private int width, height, x, y;
    private Color color;
    private Dimension d;

    public Bar(int width, int height, int x, int y, Color color){
        super();
        this.d = new Dimension(width, height);
        this.setPreferredSize(d);
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(this.color);
        g.drawRect(this.x, this.y, this.width, this.height);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
