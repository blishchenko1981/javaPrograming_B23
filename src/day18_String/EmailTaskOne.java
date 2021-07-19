package day18_String;

import java.util.Scanner;

public class EmailTaskOne {
    public static void main(String[] args) {
        /*
        1. EmailTask1:
            Assume that strings.email address is constructed by person's first name and
            followed by an underscore and last name.
            Write a program that can swap first name with last name in the strings.email
             (Seperated by an underscore). If the strings.email doesn't contain an underscore print
              the given input strings.email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com


         */
        Scanner scan = new Scanner(System.in);
        String email = scan.next();// mike_tyson@gmail.com
        int indexOfAt = email.indexOf("@");
        int indexOf = email.indexOf("_");

        String firstName = email.substring(0, indexOf);
        String lastName = email.substring(indexOf + 1, indexOfAt);
        String remaining = email.substring(indexOfAt);

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);

        String result = lastName + "_" + firstName + remaining;
        System.out.println("result = " + result);




    }
}
