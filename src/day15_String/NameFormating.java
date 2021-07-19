package day15_String;

import java.util.Locale;
import java.util.Scanner;

public class NameFormating {
    public static void main(String[] args) {
        // no white space
        //first character in Upper case and rest in lower;

        Scanner scan = new Scanner(System.in);
        System.out.println("Your first name :");
        String firstName = scan.next().trim();// viTALii
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Your last name:");
        String lastName = scan.next().trim();

        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();


        System.out.println(firstName + " "+lastName);




    }
}
