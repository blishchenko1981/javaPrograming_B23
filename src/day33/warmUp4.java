package day33;

import utilities.ArraysUtility;

import java.util.Arrays;

public class warmUp4 {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }

        System.out.println(result);

        System.out.println("-------------------------------");

        int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 34, 4, 4, 45, 5, 5, 5, 5};
        int[] newarray = {};

        for (int each : array) {
            if (!ArraysUtility.isContain(newarray, each)) {
                newarray = ArraysUtility.addElement(newarray, each);
            }
        }


        int [] numbers = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,6,};
        System.out.println(Arrays.toString(removeDup(numbers)));

    }

    public static int[] removeDup(int[] array) {
        int[] newarray = {};

        for (int each : array) {
            if (!ArraysUtility.isContain(newarray, each)) {
                newarray = ArraysUtility.addElement(newarray, each);
            }
        }


        return newarray;
    }
    public static double[] removeDup(double[] array) {
        double[] newarray = {};

        for (double each : array) {
            if (!ArraysUtility.isContain(newarray, each)) {
                newarray = ArraysUtility.addElement(newarray, each);
            }
        }


        return newarray;
    }
    public static String[] removeDup(String[] array) {
        String[] newarray = {};

        for (String each : array) {
            if (!ArraysUtility.isContain(newarray, each)) {
                newarray = ArraysUtility.addElement(newarray, each);
            }
        }


        return newarray;
    }
    public static char[] removeDup(char[] array) {
        char[] newarray = {};

        for (char each : array) {
            if (!ArraysUtility.isContain(newarray, each)) {
                newarray = ArraysUtility.addElement(newarray, each);
            }
        }


        return newarray;
    }




}
/*
 Task4:
        1. create a method that can remove the duplicates from an array of integer
            Ex:
              int[] array = {1,1,1,2,2,2,3,4,5,5,5};
              removeDup(array);  ===> {1,2,3,4,5}

        2. create a method that can remove the duplicates from an array of double

        3. create a method that can remove the duplicates from an array of String

        4. create a method that can remove the duplicates from an array of char
            HINT: how did you remove the duplicates from a string?
 */