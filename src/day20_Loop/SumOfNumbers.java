package day20_Loop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        4. Write a program that calculates the sum of Time.numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
         */
Scanner scan = new Scanner(System.in);
int result = 0;

for (int i =0;i == 0;   ) {
    System.out.println("enter number:");

    int n = scan.nextInt();
    if (n<0 ) {break;}
    result += n;
}
        System.out.println("result = " + result);
scan.close();
    }
}
