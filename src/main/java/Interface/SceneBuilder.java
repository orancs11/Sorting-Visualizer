package Interface;

import Logic.Utilities;
import Model.Recorder;

import javax.swing.*;
import java.awt.*;

public class SceneBuilder {

    private JFrame frame;
    private JPanel mainPanel;
    private JPanel lowerPanel;
    private BarPanel barPanel;

    public SceneBuilder(int width, int height){
        frame = new JFrame("Visualizer");
        frame.setPreferredSize(new Dimension(Math.max(500, width), Math.max(500, height)));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        lowerPanel = new JPanel();
        barPanel = new BarPanel();

        initiate();
    }


    private void prepareLowerPanel(int[] iteration){
        barPanel.removeAll();
        barPanel.createBars(iteration);
        lowerPanel.add(barPanel);
    }

    private void prepareMainPanel(){
        mainPanel.add(lowerPanel);
    }

    private void prepareScene(){
        frame.getContentPane().add(mainPanel);
        frame.pack();
    }

    private void renderLowerPanel(int[] iteration){
        barPanel.removeAll();
        barPanel.createBars(iteration);
        barPanel.revalidate();
    }

    private void initiate(){
        prepareLowerPanel(new int[]{1, 2, 3, 4, 5});
        prepareMainPanel();
        prepareScene();
    }


    public void display(){
        frame.setVisible(true);
    }

    public void display(int[] original){
        renderLowerPanel(original);
        frame.setVisible(true);
    }

    public void playRecord(Recorder recorder){

        for(int[] iteration : recorder){
            renderLowerPanel(iteration);
            Utilities.wait(1);
        }
    }

}
