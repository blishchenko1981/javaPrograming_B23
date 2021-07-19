package day33;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        int[]arrInt = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(reverse(arrInt)));

        double[]arrDouble = {1.2, 2.3, 3.4, 4.5};
        System.out.println(Arrays.toString(reverse(arrDouble)));

        String[] arrStr = {"fork", "spoon", "road", "glass"};
        System.out.println(Arrays.toString(reverse(arrStr)));

        char[] arrChar = {'q','w', 'e', 'r', 't', 'y'};
        System.out.println(Arrays.toString(reverse(arrChar)));

    }

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
}
