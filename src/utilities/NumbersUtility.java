package utilities;

public class NumbersUtility {
    //1. function can return maximum number from array of integers

    public static int maxNumber(int[] arr){
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    //2. function can return minimum number from array of integers
    public static int minNumber(int[] arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }

    // isOdd
    //isEven
    //addition
    // subtruction
    //divition
}
