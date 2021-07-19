package arrays;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt()};

        int sum = 0;

        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];

        }
        System.out.println(sum);


    }
}
