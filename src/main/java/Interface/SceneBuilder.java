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
    private InputPanel inputPanel;

    public SceneBuilder(int width, int height){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(Math.max(500, width), Math.max(500, height)));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        upperPanel = new JPanel();
        upperPanel.setLayout(new BoxLayout(upperPanel, BoxLayout.Y_AXIS)); // This might be unnecessary

        lowerPanel = new JPanel();
        barPanel = new BarPanel();
        inputPanel = new InputPanel();

        initiate();
    }


    private void prepareUpperPanel(){

        upperPanel.add(inputPanel);
    }
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

    private void renderLowerPanel(int[] iteration){
            this.lowerPanel.remove(barPanel);
            barPanel.removeAll();
            barPanel.createBars(iteration);
            lowerPanel.add(barPanel);
    }

    private void initiate(){
        prepareUpperPanel();
        prepareLowerPanel(new int[]{1, 2, 3, 4, 5});
        prepareMainPanel();
        prepareScene();
    }

    public void display(){
        frame.setVisible(true);
    }

    public void playRecord(Recorder recorder){
        for(int[] iteration : recorder){
            try{
                renderLowerPanel(iteration);
                Thread.sleep(1000);
                System.out.println("1000 millisecond sleep here ...");
            }
            catch(InterruptedException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

}
