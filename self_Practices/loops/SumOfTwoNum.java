package loops;

import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        /*
1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
 */
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i > 0; i++) {

            System.out.println("enter two numbers:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = a + b;
            System.out.println("addition a+b=" + result);


            for (int j = 0; j < 1; j--) {

                System.out.println("do you want to continue? Yes/No");
                String answer = scan.next();
                if(answer.equalsIgnoreCase("yes")){
                    break;
                } else if(!answer.equalsIgnoreCase("no")&& !answer.equalsIgnoreCase("yes")){
                    System.out.println("Wrong input , try again");
                } else {
                    System.exit(0);
                }

            }
        }

        scan.close();
    }
}
