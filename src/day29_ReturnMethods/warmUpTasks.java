package day29_ReturnMethods;

import java.util.Arrays;
import java.util.Locale;

public class warmUpTasks {

    public static void main(String[] args) {
        System.out.println("----------  task 1   ----------------------");

        posNegZero(-0);

        System.out.println("======================================");
        int[] numbers = {10, 20, 30, -10, -20, 0};
        for (int num : numbers) {
            posNegZero(num);
        }

        System.out.println("----------  task 2   ----------------------");

        int arr1[] = {1, 23, 34, 64, 54};
        int arr2[] = {2, 3, 4, 5, 6};
        mergeTwoArrays(arr1, arr2);

        int array1[] = {100, 2300, 340, 640, 540};
        int array2[] = {20, 30, 40, 50, 06};
        mergeTwoArrays(array1, array2);

        System.out.println("-----------------   TASK 3  -----------------------");
        formatFullName("ViTaLIi", "BLishcHenKo");

        System.out.println("-------------  task 4  _-----------------------");
printMaxNumber(45,45);


        System.out.println("---------------  task 5 -----------------------");
        int[] arr = {23,23,44,34,234,55,3};
        printInDescendingOrder(arr);

    }

    public static void posNegZero(int number) {

        if (number == 0) {
            System.out.println("Number " + number + " is zero");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative");
        } else {
            System.out.println("Number " + number + " is positive");
        }

    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each : arr2) {
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void formatFullName(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
    }

    public static void printMaxNumber(int num1, int num2){
        System.out.println(num1>num2 ? num1: num2);
    }

    public static void printInDescendingOrder(int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j= 0; i >=0 ; i--, j++ ) {

            result[j] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
/*
1. create a function that can check if the given integer is positive, negative or zero

2. create a function that can print out the combination of two integer arrays

3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers

5. create a function that can print out the array of integers in descending order
 */