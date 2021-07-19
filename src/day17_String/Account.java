package day17_String;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("You account number:");
        String account = scan.next();

     /*   if (account.length()== 7 || account.length() == 10 ) {
            if(account.charAt(0)== '2' && account.length()== 7){
                System.out.println("Valid account");
            }else if (account.length()== 7 || account.length() == 10 ){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }

        }else {
            System.out.println("Invalid account");
        }
        */
        char firstChar = account.charAt(0);
        switch (firstChar) {
            case '2':
                if (account.length() == 7) {
                    System.out.println("valid");
                } else {
                    System.out.println(" invalid. should be 7 characters long");
                }
                break;
            case '5':
                if (account.length() == 10) {
                    System.out.println("valid");
                } else {
                    System.out.println(" invalid. should be 10 characters long");
                }
                break;
            default:
                System.out.println("Invalid account");
        }


        scan.close();
    }
}
/*
1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”

 */