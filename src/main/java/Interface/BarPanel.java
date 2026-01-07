package Interface;

import Model.Recorder;

import javax.swing.*;
import java.awt.*;
import java.util.EmptyStackException;

public class BarPanel extends JPanel {
    private final Color BAR_COLOR = Color.lightGray;
    private final int X = 0, Y = 0;

    public BarPanel(){
        super(new FlowLayout(FlowLayout.CENTER, 0, 250));
    }

    public void createBars(int[] target){
        int length = target.length;
        if(length == 0) throw new EmptyStackException();
        int barWidth = 900 / length; // Set width for all bars

        for(int number : target){
            int barHeight = 10 * number;
            Bar tempBar = new Bar(barWidth, barHeight, X, Y- (barHeight / 2), BAR_COLOR);
            this.add(tempBar);
        }
    }

}
