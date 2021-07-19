package day17_String;

import java.util.Scanner;

public class Initials2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();// Vitalii Blishchenko
        String firstName = fullName.substring(0 , fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

scan.close();
    }
}
