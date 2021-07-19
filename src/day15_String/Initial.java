package day15_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        /*
        First name and last name
        print initials
        ex : Vitalii Blishchenko
        =====> V B
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("your first name");
        String firstName = scan.next();
        System.out.println("your last name");
        String lastName = scan.next();
        scan.close();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);
      // or String initials = first + "." + last ........then print initials
        System.out.println(first + "." + last);




    }
}
