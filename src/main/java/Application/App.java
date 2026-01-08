package Application;

import Interface.Bar;
import Interface.SceneBuilder;
import Logic.Sorter;
import Logic.Utilities;
import Model.Recorder;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App
{
    public static void main( String[] args ) {
        int[] original = Utilities.createArray(100, true);

        Sorter sorter = new Sorter(original);
        Recorder recorder = sorter.bubbleSort();


        SceneBuilder sceneBuilder = new SceneBuilder(1920, 1080);
        sceneBuilder.display(original);
        sceneBuilder.playRecord(recorder);
    }
}
