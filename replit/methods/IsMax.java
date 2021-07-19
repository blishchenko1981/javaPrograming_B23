package methods;

import java.util.Scanner;

public class IsMax {
    // Write your code here
    public static int findMax(int[] array){

       int  max = array [0];
        for(int each : array)
            if(each>max) {
                max = each;
            }
        return max;
    }
    public static double findMax(double[] array) {

        double max = array[0];
        for (double each : array)
            if (each < max) {
                max = each;
            }
        return max;

    }
// DO NOT TOUCH THE MAIN METHOD

        public static void main(String [] args) {

            Scanner in = new Scanner(System.in);
            boolean runInt = in.nextBoolean();
            int size = in.nextInt();

            if(runInt) {
                int [] arr = new int[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(findMax(arr));
            } else {
                double [] arr = new double[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextDouble();
                }
                System.out.println(findMax(arr));
            }

        }
}
