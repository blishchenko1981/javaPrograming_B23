package day13_ScannerContinue;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      /*  System.out.println(" Enter your job title :");
        String jobTitle = input.next();
        input.next();
        System.out.println("Enter your gender");
        String gender = input.next();



        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your job title: ");
        String jobTitle = scan.nextLine();


        System.out.println("jobTitle = " + jobTitle);






    }


}
