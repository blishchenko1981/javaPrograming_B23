package arrays;

import java.util.Arrays;

public class reassighnArray {
    public static void main(String[] args) {
        int [] num1 = {1,2,3,4,5};
        int [] num2 = new int [3];
        num2 = num1;
        System.out.println(Arrays.toString(num2));

    }
}
