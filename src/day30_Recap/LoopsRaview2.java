package day30_Recap;

import java.util.Scanner;

public class LoopsRaview2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int n = 0;

        while(!answer.equalsIgnoreCase("no")) {
            System.out.println("Enter a number: ");
            n = scan.nextInt();
            System.out.println("Would you like fo enter another number");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes")|| answer.equals("no"))){
                System.out.println(" Invalid Answer!!! Would you like fo enter another number");
                answer = scan.next();
            }

        }



    }
}
