package day13_ScannerContinue;

import java.util.Scanner;

public class PersonalInfo {

    /*
    1 salary nextInt
    2 gender next()
    3 fullName nextLine()
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter your salary");
        int salary = scan.nextInt();

        System.out.println("Enter your gender : ");
        String gender = scan.next();

        scan.nextLine();

        System.out.println(" Enter your full name :");
        String fullName = scan.nextLine();

        System.out.println("Job title");
        String jobTitle = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("jobTitle = " + jobTitle);

    }





}
