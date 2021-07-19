package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] newArray =  new int[nums.length*2] ;
        newArray[newArray.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(newArray));



    }
}
