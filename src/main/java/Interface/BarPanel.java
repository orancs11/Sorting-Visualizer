package Interface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BarPanel extends JPanel {
    private static final Color BACKGROUND_COLOR = Color.black;
    private static final Color BAR_COLOR = Color.white;

    private ArrayList<Rectangle> bars = new ArrayList<>();

    public BarPanel(){}



    public void createBars(int[] arr){
        for(int number : arr){

            bars.add(new Rectangle());
        }
    }


}
