package day28_Methods;

import java.util.Scanner;

public class Void_MethodPractices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        printOddNumbers(scan.nextInt(), scan.nextInt());

        System.out.println("Enter your number:");
        printEvenNumbers(scan.nextInt(), scan.nextInt());

        calculatrAge("blue", 1981, 2034);// do not give unnecessary information

        System.out.println("--------------------------------------");
        eligibleToVote(34, true);

        System.out.println("--------------------------------------------");
        calculator(12.32, 32,'+');
    }


    public static void printOddNumbers(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();


    }

    public static void printEvenNumbers(int from, int to){
        for (int i = from; i <= to ; i++) {
            if(i %2 == 0){
                System.out.print(i + " ");
            }


        }
        System.out.println();

    }

    public static void calculatrAge(String eyeColor, int Birthyear, int year){
        System.out.println("your age in: " + year +"year will be " + (year - Birthyear));
    }

    public static void eligibleToVote(int age, boolean isUSCitizen){
        if(age >=21 && isUSCitizen){
            System.out.println("U R eligible to vote");
        }else{
            System.out.println("Your are not eligible to vote");
        }
    }

    public static void calculator(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println("Addition : " + (num1 + num2));
                break;
            case '-':
                System.out.println("Substruction : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication : " + (num1 * num2));
                break;
            case '/':
                System.out.println("Divition : " + (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder : " + (num1 %num2));
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }







}




        /*
        task:
    1. create a method that can print odd numbers between 1~100 in a same line seperated by space

    2. create a method that can print even numbers between 1~100

    3. create a method that can calculate the age of the person

    4. check eligibility to vote
﻿
         */

