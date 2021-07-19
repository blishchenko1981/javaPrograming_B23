package day19_Loops;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50 ; i++) {
            System.out.println("Push Up " + i);

        }

        System.out.println("======================================");
/*
2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
        for (int i = 1; i <= 8; i++) {
            System.out.println("\t\t* * * * * * ");}


                System.out.println("==============================================");

        /*3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *
         */
        System.out.println("* **** *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("*       *");
        }
        System.out.println("* ** ** *");



        System.out.println("=====================================");
        /*
        4. write a program that can calculate the sum of all Time.numbers between 1 to 100

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println(sum);














    }
}

