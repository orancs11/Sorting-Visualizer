package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {
    private JButton setButton;
    private JButton unsortButton;
    private JTextField textField;
    private JLabel warningLabel;

    public InputPanel(){
        super(new FlowLayout());
        setButton = new JButton("Set Array Size");
        setButton.addActionListener(setButtonActionListener());

        unsortButton = new JButton("Shuffle");
        unsortButton.addActionListener(setUnsortButtonActionListener());

        textField = new JTextField("Enter Number", 20);
        warningLabel = new JLabel();

        this.add(textField);
        this.add(setButton);
        this.add(unsortButton);
        this.add(warningLabel);
    }

    private ActionListener setButtonActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warningLabel.setText("Set Array Size button is pressed");
            }
        };
    }


    private ActionListener setUnsortButtonActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warningLabel.setText("Shuffle button is pressed");

            }
        };
    }
}
