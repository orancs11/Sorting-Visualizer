package Logic;

public class Sorter {

    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size - 1; j++)
                if(arr[j] > arr[j + 1]) swap(arr, i, j);
    }

    public static void selectionSort(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            int minIndex = i;
            for(int j = i + 1; j < size - 1; j++)
                if(arr[j] < arr[minIndex]) minIndex = j;
            swap(arr, i, minIndex);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
