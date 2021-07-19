package day19_Loops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        //8. ask user to enter a number for 5 times,
        // then return the minimum number
        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // any user entered number will be less than this#;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter your number");
            int n = scan.nextInt();

            if (n<min){
                min= n; //replace min value when n is smaller;
            }
        }


        System.out.println("min = " + min);


        scan.close();

    }


}
