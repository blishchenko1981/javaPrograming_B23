package arrays;

import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class PrintUniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE


        for (int each : nums) {
            if (frequency(nums, each) == 1) {
                System.out.println(each);
            }


        }
    }

    public static int frequency(int[] array, int element) {
        int count = 0;

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }


}