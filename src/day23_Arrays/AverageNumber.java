package day23_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do u want to enter?");
        int[] numbers = new int[scan.nextInt()];
        int sum = 0;

        for (int i = 0; i <= numbers.length- 1 ; i++) {
            System.out.println("Enter the number");
          numbers[i]= scan.nextInt();
          sum += numbers[i];
        }

        System.out.println("sum = " + sum);

        double average = (double)sum/ numbers.length;
        System.out.println("average = " + average);


        scan.close();



    }
}
