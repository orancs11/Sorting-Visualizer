package oran;

/**


 */
public class App
{
    public static void main( String[] args ) {
        int[] numbers = new int[]{5, 2, 3, 4, 1, 8, 2, 12, 3, 15};
        System.out.println("Original version");
        display(numbers);
        Sorter.bubbleSort(numbers);
        System.out.println("Sorted version");
        display(numbers);


    }

    public static void display(int[] arr){
        String message = "";
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) message = String.valueOf(arr[i]);
            else message = arr[i] + ", ";
            System.out.print(message);
        }
        System.out.println();
    }

}
