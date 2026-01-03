package Interface;

import javax.swing.*;
import java.awt.*;

public class BarPanel extends JPanel {
    private static final Color BACKGROUND_COLOR = Color.black;
    private static final Color BAR_COLOR = Color.white;
    private static final Color CURRENT_BAR_COLOR = Color.green;
    private static final int FIX_WIDTH = 10;

    public BarPanel(){
        super();
    }

    public void prepareEnv(Graphics g, int width, int height){
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, width, height); // Fill rectangle where upper left x and y points is 0 and covers all the frame with width and height
    }

    public void createBars(int[] arr, Graphics g){
        g.setColor(BAR_COLOR);
        int height, x, y;
        x = 10;
        for(int number : arr){
            height = number * 10;
            y = number;
            g.drawRect(FIX_WIDTH, height, x, y);
            x+= 10;
        }
    }

    public void clearPanel(){
        this.removeAll();
    }




}
