package Logic;

import Model.Recorder;

import java.util.Arrays;

public class Sorter {
    private Recorder history;
    private final int[] target;

    public Sorter(int[] array){
        target = array;
        history = new Recorder();
    }

    public Recorder bubbleSort(){
        clearHistory();

        int[] copyTarget = Utilities.copyArray(target);
        int size = copyTarget.length;

        for(int i = 0; i < size; i++)
            for(int j = 0; j < size - 1; j++)
                if(copyTarget[j] > copyTarget[j + 1]){
                    swap(i, j);
                    history.record(copyTarget);
                }
        return history;
    }

    public Recorder selectionSort(){
        clearHistory();

        int[] copyTarget = Utilities.copyArray(target);
        int size = copyTarget.length;

        for(int i = 0; i < size; i++){
            int minIndex = i;
            for(int j = i + 1; j < size - 1; j++)
                if(copyTarget[j] < copyTarget[minIndex]) minIndex = j;
            swap(i, minIndex);
            history.record(copyTarget);
        }

        return history;
    }

    public void clearHistory(){
        history.record(target);
        this.history.clear();}

    public int[] getOriginalArray(){
        return target;
    }

    private void swap(int i, int j){
        int temp = target[i];
        target[i] = target[j];
        target[j] = temp;
    }

}
