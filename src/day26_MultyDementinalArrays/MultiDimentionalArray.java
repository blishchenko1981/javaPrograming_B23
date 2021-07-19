package day26_MultyDementinalArrays;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {

        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
               //index1      0            1                 2
        for (int i = arr2D.length-1; i >=0 ; i--) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------- TASK 2 __________________-");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length-1; j >=0 ; j--) {

                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println(" ------------ TASK 3   -------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int j = arr2D[i].length-1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();


        }





    }
}
/*
Given:
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3


            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */