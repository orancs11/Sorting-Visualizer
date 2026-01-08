package Logic;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Utilities {

    public static boolean isNumericString(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException nfe){
            System.out.println("Input field is not number");
            return false;
        }
    }

    public static int convertInt(String message){
        return Integer.parseInt(message);
    }

    public static int[] createArray(int size, boolean isRandom){
        int[] result = new int[size];
        Random random = new Random(42);
        for(int i = 0; i < size; i++){
            int currNumber = i;
            if(isRandom){
                currNumber = random.nextInt(100) + 1;
            }
            result[i] = currNumber;
        }
        return result;
    }

    public static int[] copyArray(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++)  result[i] = arr[i];
        return result;
    }

    public static String toStringArray(int[] arr){
        StringBuilder result = new StringBuilder("{");
        for(int i = 0; i < arr.length; i++){
            if(i + 1 == arr.length) break;
            else result.append(arr[i]).append(", ");
        }
        return result + "}";
    }

    public static void wait(int second){
        try{
            Thread.sleep(second * 1000L);
        }
        catch(InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
