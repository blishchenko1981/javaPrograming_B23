package day20_Loop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number:");
        int number = scan.nextInt();
        int result = 1;

        for (int i = number; i >0 ; i--) {
            result*= i;

        }
        System.out.println("result = " + result);


        scan.close();
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */

    }
}
