package day33;

import java.util.Arrays;
import utilities.ArraysUtility;

public class WarmUp_0 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(removeElement(numbers, 5)));

        System.out.println("===========================================");
        double[]array1 = {4.5, 3.4, 2.3, 1.2, 5.6, 3.4};
        double[] result =  removeElement(array1, 2);
        System.out.println(Arrays.toString(result));

        System.out.println("===========================================");
        String [] names = {"John", "Vitalii", "Blishchenko" , "Blishchenko"};
        names = removeElement(names, 3);
        System.out.println(Arrays.toString(names));

        System.out.println("======================================");

        char[] ch1 = {'a', 'b','c'};
        char[]ch2  = {'d', 'e', 'f', 'g'};

        System.out.println(ArraysUtility.merge(ch1, ch2));


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



}
