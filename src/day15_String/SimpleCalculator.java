package day15_String;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("first number");
        double num1 = scan.nextDouble();

        System.out.println("math operator");
        char mathOperator =scan.next().charAt(0);

        System.out.println("second number");
        double num2 = scan.nextDouble();
        double result = 0;
        switch(mathOperator){
            case '-' :
                result = num1- num2;
                break;
            case '+':
                result= num1+num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("invalid");

                System.out.println(result);



        }


        System.out.println(result);



    }
}
