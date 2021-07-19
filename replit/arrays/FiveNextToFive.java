package arrays;

import java.util.Scanner;

public class FiveNextToFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        // TODO Type your code below:
        boolean result = true;
        int have5 = 0;


        for (int i = 0; i < nums.length; i++) {   //3 5 5 7 8
            if (nums[i] == 5) {
                have5++;
            } else {
                have5 += 0;
            }
        }
        int fiveFive = 0;
        if (have5 > 0) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    fiveFive++;
                } else {
                    fiveFive +=0;
                }
            }
        } else {
            fiveFive = 0;
        }

        if(have5>0 && fiveFive>0){
            result=true;
        }else {
            result = false;
        }

        System.out.println(result);

    }
}
