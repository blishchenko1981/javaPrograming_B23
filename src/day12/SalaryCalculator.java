package day12;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    1. hourlyRate
    2. hours per week
    3. weeks per year
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your hourly rate : ");

        double hourlyRate = scan.nextDouble();
        System.out.println("How many hours you work in a week : ");
        int hoursInWeek = scan.nextInt();
        System.out.println("and weeks per year : ");
        int weeks = scan.nextInt();
        double salary = hourlyRate* hoursInWeek*weeks;
        System.out.println("You going to get "+ salary+ " by the end of the 2022 year!!!");








    }

}
