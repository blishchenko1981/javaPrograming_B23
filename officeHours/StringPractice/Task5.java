package StringPractice;

import java.util.Scanner;

public class Task5 {
    /*
    5.Creating an strings.email

				    Ask user to enter fullname. FirstName and lastName should be at least 6 character long.
				    If they are shorter than that print “Invalid data” and program should end.
				    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created strings.email.
				    The final strings.email should be in all lowercase.

				    input: JamesBond Secret
				    output: jameret@cybertek.com

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        String email = "";
        String domain = "@hahanamail.com";


        // Jameses Bondes;

        int spaseIndex = name.indexOf(" ");

        String firstName = name.substring(0, spaseIndex);
        System.out.println(firstName);
        String lastName = name.substring((spaseIndex + 1));
        System.out.println(lastName);

        if (firstName.length() >= 6 && lastName.length() >= 6) {
            email = firstName.substring(0, 4) + "" + lastName.substring(lastName.length() - 3) +
                    domain;


        } else {
            System.out.println("Invalid");
        }

        System.out.println(email);
      }
    }

