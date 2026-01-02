package oran;

public class Sorter {
    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp =  arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
