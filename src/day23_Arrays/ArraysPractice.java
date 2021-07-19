package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number from 1 to 12: ");
        int monthNumber= scan.nextInt();



        String month[] = { "No such month ","January", "February", "March" , "April", "May" , "June", "July",
                "August", "September","October", "November", "December"};

            while (monthNumber>0 && monthNumber<13) {
            System.out.println(month[monthNumber]);
            System.out.println("Enter again:");
            monthNumber = scan.nextInt();

            if (monthNumber> 12 || monthNumber<0) {
                System.out.println(" Wrong input ");
                System.out.println("Enter again:");
                monthNumber = scan.nextInt();
            }

            }






    }
}
