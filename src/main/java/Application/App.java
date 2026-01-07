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
        int[] target = Utilities.createArray(20, true);
        System.out.println("Here is a function representation");
        System.out.println("Original target");
        String originalVersionTarget = Utilities.toStringArray(target);
        System.out.println(originalVersionTarget);
        System.out.println("Sorter is created");

        Sorter sorter = new Sorter(target);
        Recorder recorder = sorter.selectionSort();

        System.out.println("Sorted version of target");
        String newVersionTarget = Utilities.toStringArray(sorter.getSortedArray());
        System.out.println(newVersionTarget);

        SceneBuilder sceneBuilder = new SceneBuilder(1000, 1000);
        sceneBuilder.display();
        //System.out.println(recorder);
        sceneBuilder.playRecord(recorder);
    }
}
