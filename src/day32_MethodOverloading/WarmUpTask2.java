package day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {


    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9};
        int element = 10;

        System.out.println(Arrays.toString(array));
        array = addInteger(array,element);
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------------------------");

        double[] array2 = {3.5, 5.7, 4.3};
        System.out.println(Arrays.toString(array2));//[3.5, 5.7, 4.3]

        array2 = addDouble(array2, 7.5);
        System.out.println(Arrays.toString(array2));//[3.5, 5.7, 4.3, 7.5]

        array2 = addDouble(array2, 2.1);
        System.out.println(Arrays.toString(array2));//[3.5, 5.7, 4.3, 7.5, 2.1]

        System.out.println("----------------------------");

        String [] group1 = {"Sabir", "Vitalii", "Andy"};
        String student = "Jinna";

         group1 = addString(group1, student);
        System.out.println(Arrays.toString(group1));

        System.out.println("======================================");

        char[] array3 = {'a', 'b'};
        array3 = addChar(array3, 'c');
        System.out.println(Arrays.toString(array3));

        System.out.println("-------------------------------------");
        // ---------------------    method overloading  -----------------------------

        int [] arr1 = {1,2,3,4,5,6};
        arr1 = addElement(arr1, 7);
        System.out.println(Arrays.toString(arr1));

        String [] items = {"MIlk", "Salt", "Beer"};
        items = addElement(items, "Cranberry");
        System.out.println(Arrays.toString(items));



    }
    public static int[] addInteger(int[] array, int number){

      /*  int [] result = new int [ array.length + 1];
        int i = 0;
        for (int element : array) {
            result[i++] = element;
        }
        result[i] = number;
        return result;*/

        int[] result = Arrays.copyOf(array,array.length+1);
        result[result.length - 1] = number;
        return result;
    }

    public static double[] addDouble(double[] array, double number) {

        double[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = number;

        return result;
    }

                                  // {"A" , "B"}           "C"
    public static String[] addString(String[] array, String str){

        String [] result = Arrays.copyOf(array, array.length + 1 );
        result[result.length - 1] = str; // {A, B, C}

        return result;
    }
    public static char[] addChar(char[] array, char ch) {

        char[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = ch; // {A, B, C}

        return result;
    }


    // ---------------------    method overloading  -----------------------------

    public static int[] addElement(int[] array, int number){

      /*  int [] result = new int [ array.length + 1];
        int i = 0;
        for (int element : array) {
            result[i++] = element;
        }
        result[i] = number;
        return result;*/

        int[] result = Arrays.copyOf(array,array.length+1);
        result[result.length - 1] = number;
        return result;
    }

    public static double[] addElement(double[] array, double number) {

        double[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = number;

        return result;
    }

    // {"A" , "B"}           "C"
    public static String[] addElement(String[] array, String str){

        String [] result = Arrays.copyOf(array, array.length + 1 );
        result[result.length - 1] = str; // {A, B, C}

        return result;
    }
    public static char[] addElement(char[] array, char ch) {

        char[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = ch; // {A, B, C}

        return result;
    }
}
/*
Task2:
    1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array

 */