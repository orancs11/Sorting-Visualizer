package Interface;

import Model.Recorder;

import javax.swing.*;
import java.awt.*;

public class SceneBuilder {

    private JFrame frame;
    private JPanel mainPanel;
    private JPanel upperPanel;
    private JPanel lowerPanel;
    private BarPanel barPanel;

    public SceneBuilder(int width, int height){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(Math.max(500, width), Math.max(500, height)));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        upperPanel = new JPanel();
        lowerPanel = new JPanel();
        barPanel = new BarPanel();

        initiate();
    }

    private void prepareUpperPanel(){}
    private void prepareLowerPanel(int[] iteration){
        barPanel.removeAll();
        barPanel.createBars(iteration);
        lowerPanel.add(barPanel);
    }
    private void prepareMainPanel(){
        mainPanel.add(upperPanel);
        mainPanel.add(lowerPanel);
    }
    private void prepareScene(){
        frame.getContentPane().add(mainPanel);
        frame.pack();
    }
    private void renderLowerPanel(Recorder history){
        for(int [] iteration : history){
            this.lowerPanel.remove(barPanel);
            barPanel.removeAll();
            barPanel.createBars(iteration);
        }
    }
    private void initiate(){
        prepareUpperPanel();
        prepareLowerPanel(new int[]{1, 2, 3, 4, 5});
        prepareMainPanel();
        prepareScene();

    }

}
