package day21_Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0 ;
        int n=0;
        while ( n>=0) {
            System.out.println("enter your number");//3
                   n = scan.nextInt();
            sum += n;
        }

        System.out.println("sum = " + sum);




    }
}
