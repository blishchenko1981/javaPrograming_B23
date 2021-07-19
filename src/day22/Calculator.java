package day22;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        char operator;

        String answer = "yes";

        while(answer.equals("yes")) {
            System.out.println("enter two numbers:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();


            System.out.println("enter a math operator:");
            operator = scan.next().charAt(0);

            if (operator == '-') {
                System.out.println("subtraction: " + (num1 - num2));

            } else if (operator == '+') {
                System.out.println("addition: " + (num1 + num2));
            } else if (operator == '*') {
                System.out.println("mult: " + (num1 * num2));
            } else if (operator == '/') {
                System.out.println("divition: " + (num1 / num2));
            } else {
                System.out.println("Invalid operator");
            }

            System.out.println("do u want continue");
            answer = scan.next();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.out.println("Invalid Entry . Please be patient ");
            System.out.println("do u want continue?");
            answer = scan.next();}

        }

    }
}
