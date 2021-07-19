package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int each = nums[i];
            if (each > max) {
                max = each;
            }

        }
        System.out.println(max);


    }
}
