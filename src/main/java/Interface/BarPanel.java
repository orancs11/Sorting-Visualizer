package Interface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BarPanel extends JPanel {
    private static final Color BACKGROUND_COLOR = Color.black;
    private static final Color BAR_COLOR = Color.white;
    private static final Color CURRENT_BAR_COLOR = Color.green;
    private static final int FIX_WIDTH = 10;

    public BarPanel(){}



    public void createBars(int[] arr, Graphics g){
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
