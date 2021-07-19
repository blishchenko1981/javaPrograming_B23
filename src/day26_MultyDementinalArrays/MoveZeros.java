package day26_MultyDementinalArrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0,45,43,54,65,2,0,6};
        int[] newArr = new int[array.length];

        int i = 0;// index number of the result
        for (int each : array) {

            if(each!= 0){
                newArr[i++] = each;
            }
        }
        System.out.println(Arrays.toString(newArr));

        System.out.println("================    solution2  ForLoop   =========================");

        for (int j = 0, k = 0; j <array.length ; j++) {
            if(array[j]!= 0){
                newArr[k] = array[j];
                k++;
            }
        }

        System.out.println(Arrays.toString(newArr));





    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};
            output:
                {10, 5, 1, 0, 0, 0}
      MUST use for each loop
 */