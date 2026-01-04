package Application;

import Interface.Bar;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App
{
    public static void main( String[] args ) {
        JFrame frame = new JFrame();

        JPanel inputPanel = new JPanel(new FlowLayout());
        JPanel barPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        JPanel mainPanel = new JPanel(new BorderLayout());

        JTextField inputField = new JTextField("Enter Number", 20);
        JButton sendButton = new JButton("Confirm");

        int[] arr = new int[]{1, 25, 31, 4, 5, 6, 7, 8, 9, 10};
        for(int number : arr) {
            int width = 100;
            int height = number * 10;
            Bar bar = new Bar(width, height, 0, 25, Color.red);
            barPanel.add(bar);
        }

        inputPanel.add(inputField);
        inputPanel.add(sendButton);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(barPanel, BorderLayout.CENTER);

        frame.setSize(1000, 1000);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
