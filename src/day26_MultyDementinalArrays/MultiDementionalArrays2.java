package day26_MultyDementinalArrays;

import java.util.Arrays;

public class MultiDementionalArrays2 {
    public static void main(String[] args) {
        //int [] nums = {1,2,3,4};
        // int[][] nums = {{1,2,3,4,5},{1,2,3,21,11,111}}; //2
        int[][][] arr3d = {{{1,2,3},{1,5,1}}, {{2,2,2},{3,12,3}}};

        System.out.println(Arrays.deepToString(arr3d));//{{{1,2,3},{1,5,1}}, {{2,2,2},{3,12,3}}};
        System.out.println(Arrays.deepToString(arr3d[1]));//{{2,2,2},{3,12,3}}
        System.out.println(Arrays.toString(arr3d[1][1]));//{3,12,3}
        System.out.println(arr3d[1][1][1]);//12

        System.out.println("==========================================");

        for (int[][] each2D : arr3d) { // for getting each two dement.Array from arr3d
            for (int[] each1D :each2D) {// for getting one dement.Array from two dementin.Array
                for (int element : each1D) {//  for getting each element from each singe=dimentin.Array
                    System.out.print(element + " ");

                }
                System.out.println(); // to append new line after print each element of each 1 dem.Array

            }
        }
    }
}
