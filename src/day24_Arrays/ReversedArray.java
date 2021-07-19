package day24_Arrays;
import java.util.Arrays;
public class ReversedArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversedArray =new int[array.length]; //enough capacity to contain the elements of original array


        for (int i = array.length-1, j= 0; i >= 0; i--,j ++) { // to get it in reverse order;
            // j = index of reversed array ;   i = index of original array;

           reversedArray[j] =  array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }
}
/*
4. Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */