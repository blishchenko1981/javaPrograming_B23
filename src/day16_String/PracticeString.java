package day16_String;

import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        /*
        1. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string");
        String word = scan.nextLine();

        if (word.length() == 0) {
            System.out.println("String is empty");
        } else if (word.length() > 3) {
            System.out.println(word.substring(word.length() - 3));
        } else {
            System.out.println(word);
        }
        scan.close();
    }
}
