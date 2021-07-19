package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        for (int i = 7; i >=0; i--) {
            int remainder = decimal%2;
           decimal=  decimal/2;
            binary [i] = remainder;
        }

        System.out.println(Arrays.toString(binary));


    }
}
