package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5, 6};

        int[] arr3 = new int[arr1.length + arr2.length]; // make sure arr3 have enough capacity;


        int j = 0; //for indexes of arr3;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));









    }
}
/*
2. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */