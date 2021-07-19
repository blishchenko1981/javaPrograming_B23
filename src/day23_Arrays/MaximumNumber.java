package day23_Arrays;

public class MaximumNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 400, 50, 0, -123};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length-1; i++) {
            int each = numbers[i];

            if (each > max){// if any greater number is occurred;
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("max " + max);
        System.out.println("min = " + min);
    }
}
//write the program  to find max and min  number from array of int