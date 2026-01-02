package Application;

import Interface.Visualizer;
import Logic.Sorter;
import javax.swing.*;

/**


 */


public class App
{
    public static void main( String[] args ) {
        int[] numbers = new int[]{5, 2, 3, 4, 1, 8, 2, 12, 3, 15};
        System.out.println("Original version");
        Sorter.display(numbers);

        //Sorter.bubbleSort(numbers); Bubble Sort
        Sorter.selectionSort(numbers);
        System.out.println("Sorted version");
        Sorter.display(numbers);

        Visualizer visualizer = new Visualizer("Visualizerr", 300, 400);
        visualizer.display();



    }
}
