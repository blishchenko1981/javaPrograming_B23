package day24_Arrays;
import java.util.Arrays;
public class FrequencyOfElements {
    public static void main(String[] args) {

        int[] arr = {1,1,3,4,3,2,4,6,7,5,54,4,34,43,3,32,2,56,7,8,6,};

        for (int j = 0; j <arr.length ; j++) {


            int element = arr[j];
            int count = 0; // for store frequency of the variable element;

            for (int i = 0; i < arr.length; i++) { //used for finding the frequency of ONE element

                if (arr[i] == element) {
                    count++;
                }
            }

            if (count == 1) { // to check if element is unique;
                System.out.print(element+ " ");
            }


        }



    }
}
/*
 write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4

 */