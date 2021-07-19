package day18_String;

import java.util.Locale;
import java.util.Scanner;

public class EmailTaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf);
        firstName = (""+ firstName.charAt(0)).toUpperCase()+ firstName.substring(1);

        String lastName = email.substring(indexOf+1, indexOfAt);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);


        String domain = email.substring(indexOfAt+1, email.indexOf("."));

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("domain = " + domain);








        /*
         2. EmailTask2:
        Assume that strings.email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that will print out information about user based on strings.email. Print first name, last name, and domain.
           First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
         */


    }

}
