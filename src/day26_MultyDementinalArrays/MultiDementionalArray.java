package day26_MultyDementinalArrays;

import java.util.Arrays;

public class MultiDementionalArray {
    public static void main(String[] args) {

        // 2 dementional Array;

        int[][] arr2D = {  {1,2,3,5}, {1,2,3,4,}, {5,6,5,4,3,4} };

        System.out.println(arr2D.length);


        System.out.println(Arrays.deepToString(arr2D));//{1,2,3,5}, {1,2,3,4,}, {5,6,5,4,3,4}
        System.out.println(Arrays.toString(arr2D[1]));//{1,2,3,4,}
        System.out.println(arr2D[1][1]);//2

        System.out.println("=============================================");


        for (int i = 0; i < arr2D.length; i++) {
            int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j < each1DArray.length; j++) { // j: index numbersof the elements
                // in each single dimen.Array

                System.out.println(each1DArray[j]);
            }
        }
            System.out.println("===============================================");

            for ( int[] each1D :arr2D) {
                System.out.print(Arrays.toString(each1D));
                for (int element : each1D) {
                    System.out.print(element+" ");
                }
                System.out.println();
            }










    }
}
