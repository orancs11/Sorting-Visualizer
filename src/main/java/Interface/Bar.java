package Interface;

import java.awt.*;

public class Bar extends Rectangle {
    private Dimension dimension;
    private Color color;
    private Point coordinates;

    public Bar(int width, int height, int x, int y, Color color){
        super(width, height, x, y);
        this.dimension = new Dimension(width, height);
        this.coordinates = new Point(x, y);
        this.color = color;
    }
}
