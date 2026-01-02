package Interface;


import javax.swing.*;
import java.awt.*;

public class Visualizer extends JFrame{

    public Visualizer(String title, int width, int height){
        super(title.isEmpty() ? "Visualizer" : title);
        this.setSize(width, height);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminate program when clicked on 'x'
    }

    public void display(){
        this.setVisible(true);
    }

    public void addComponent(Component c){
        this.add(c);
    }

    public static void createBarPlot(int[] arr){
        return;
    }

}
