package day22;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String answer = "";
        do {
            System.out.println("Enter two numbers:");

            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition: " + (n1 + n2));
            System.out.println("Do you want to continue?");
             answer = scan.next();
             while  ( !(answer.equals("yes") || answer.equals("no"))){
                 System.out.println("Invalid answer.Please reenter");
                 System.out.println("Do you want to continue?");
                 answer = scan.next();

             }


        } while (answer.equalsIgnoreCase("yes"));

        scan.close();











    }
}
