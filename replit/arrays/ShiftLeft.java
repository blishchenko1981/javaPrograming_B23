package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int [] shift = new int[size];
        for (int i = 0; i < nums.length-1; i++) {
                                  //12345
            shift[i] = nums[i+1];// 012345
                                //  2345
        }
            shift[nums.length-1] = nums[0];


        System.out.println(Arrays.toString(shift));




    }
}
