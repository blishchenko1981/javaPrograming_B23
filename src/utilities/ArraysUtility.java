package utilities;

import java.util.Arrays;

public class ArraysUtility {



    // add element to given array {1,2,3} , 4 ==> {1,2,3,4}
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
    
    // find min/max number from given array;
    public static int max(int[] array ){
        int max = array[0];
        for (int each : array) {
             max = Math.max(each,max);
        }
        return max;
    }
    public static double max(double[] array ){
        double max = array[0];
        for (double each : array) {
            max = Math.max(each,max);
        }
        return max;
    }
    public static double min(double[] array ){
        double min = array[0];
        for (double each : array) {
            min = Math.min(each,min);
        }
        return min;
    }
    public static int min(int[] array ){
        int min = array[0];
        for (int each : array) {
            min = Math.min(each,min);
        }
        return min;
    }


    // merge two arrays  {1,2,3} {4,5,6} ==> {1,2,3,4,5,6}
    public static int [] merge(int[] arr1, int []arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int each : arr1) {
            arr3[j++] = each;
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }

        return arr3;
    }
    public static double [] merge(double[] arr1, double []arr2) {
            double[] arr3 = new double[arr1.length + arr2.length];
            int j =0;
            for (double each : arr1){
                arr3[j++]= each;
            }

            for (double each : arr2) {
                arr3[j++] = each;
            }

            return arr3;
        }
    public static String [] merge(String[] arr1, String []arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int j =0;
        for (String each : arr1){
            arr3[j++]= each;
        }

        for (String each : arr2) {
            arr3[j++] = each;
        }

        return arr3;
    }
    public static char [] merge(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int j =0;
        for (char each : arr1){
            arr3[j++]= each;
        }

        for (char each : arr2) {
            arr3[j++] = each;
        }

        return arr3;
    }


    // remove the element  with given index from array
    public static int[] removeElement ( int[] array , int x){

        if(x< 0  ||x >= array.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        int[] newArray = new int[array.length- 1];

        for (int i = 0, j= 0; i < array.length ; i++) {
            if(i== x){
                continue;
            }else{
                newArray [j++] = array[i];
            }
        }


        return newArray ;
    }
    public static double[] removeElement ( double[] array , int x){

        if(x< 0  ||x >= array.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        double[] newArray = new double[array.length- 1];

        for (int i = 0, j= 0; i < array.length ; i++) {
            if(i== x){
                continue;
            }else{
                newArray [j++] = array[i];
            }
        }


        return newArray ;
    }
    public static String[] removeElement ( String[] array , int x){

        if(x< 0  ||x >= array.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        String[] newArray = new String[array.length- 1];

        for (int i = 0, j= 0; i < array.length ; i++) {
            if(i== x){
                continue;
            }else{
                newArray [j++] = array[i];
            }
        }


        return newArray ;
    }
    public static char[] removeElement ( char[] array , int x){

        if(x< 0  ||x >= array.length){
            System.err.println("Invalid Index");
            System.exit(0);
        }

        char[] newArray = new char[array.length- 1];

        for (int i = 0, j= 0; i < array.length ; i++) {
            if(i== x){
                continue;
            }else{
                newArray [j++] = array[i];
            }
        }


        return newArray ;
    }


    // reverses given arrays {1,2,3,4} ==> {4,3,2,1}
    public static int[] reverse(int[] array){
        int [] newArray = new int [array.length];

        for (int i = array.length-1, j = 0; i >= 0  ; j++,i--) {
            newArray[j] = array[i];
        }

        return newArray;
    }
    public static double[] reverse(double[] array){
        double [] newArray = new double [array.length];

        for (int i = array.length-1, j = 0; i >= 0  ; j++,i--) {
            newArray[j] = array[i];
        }

        return newArray;
    }
    public static String[] reverse(String[] array){
        String [] newArray = new String [array.length];

        for (int i = array.length-1, j = 0; i >= 0  ; j++,i--) {
            newArray[j] = array[i];
        }

        return newArray;
    }
    public static char[] reverse(char[] array){
        char [] newArray = new char [array.length];

        for (int i = array.length-1, j = 0; i >= 0  ; j++,i--) {
            newArray[j] = array[i];
        }

        return newArray;
    }


    // check if array contains given element  {1,2,3,4}, 1 ==> true
    public static boolean isContain(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }


    // create new array with unique elements of given array {1,1,2,2,3,4,5} ==> {3,4,5}
    public static int[] unique(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static double[] unique(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static String[] unique(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    public static char[] unique(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (frequency(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // find frequency of 1 given element in given array {1,1,1,1,2,2,2}, 1 ==> 4
    public static int frequency(int[] array, int element) {
        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }
    public static int frequency(double[] array, double element) {
        int count = 0;

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }
    public static int frequency(String[] array, String element) {
        int count = 0;

        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }

        return count;
    }
    public static int frequency(char[] array, char element) {
        int count = 0;

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }


    // remove duplicates from given array {1,1,1,2,2,2,3,3,3} ==> {1,2,3}
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
