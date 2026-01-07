package Logic;

import Model.Recorder;

import java.util.Arrays;

public class Sorter {
    private Recorder history;
    private int[] target;
    private int[] original;
    private boolean isSorted;
    public Sorter(int[] array){
        original = array;
        history = new Recorder();
        target = Utilities.copyArray(original);
        isSorted = false;
    }

    public Recorder bubbleSort(){
        clearHistory();
        clearTarget();

        int size = target.length;

        for(int i = 0; i < size - 1; i++)
            for(int j = 1; j < size - i; j++)
                if(target[j - 1] > target[j]){
                    swap(j - 1, j);
                    save();
                };

        isSorted = true;
        return history;
    }

    public Recorder selectionSort(){
        clearHistory();
        clearTarget();
        int size = target.length;

        for(int i = 0; i < size; i++){
            int minIndex = i;
            for(int j = i + 1; j < size; j++)
                if(target[j] < target[minIndex]) minIndex = j;
            swap(i, minIndex);
            save();
        }
        isSorted = true;
        return history;
    }

    public void clearHistory(){
        history.record(target);
        this.history.clear();}

    public int[] getOriginalArray(){
        return original;
    }
    public int[] getSortedArray(){
        return isSorted ? target : new int[0];
    }

    private void swap(int i, int j){
        int temp = target[i];
        target[i] = target[j];
        target[j] = temp;
    }

    private void clearTarget(){
        target = Utilities.copyArray(original);
        isSorted = false;
    }
    private void save(){
        history.record(Utilities.copyArray(target));
    }

}
