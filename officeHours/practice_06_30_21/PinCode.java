package practice_06_30_21;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        int attempts = 0;

        do{
            if(attempts ==3){
                System.out.println("Account blocked");
                System.exit(0);
            }
            System.out.println("Please enter your pin code");
            pinCode = in.nextInt();
            attempts++;
        }while (pinCode!= secretPinCode);

        System.out.println("Welcome to your account, how can I Help you ?");

/*
Task 1 :  While or Do - While

						 Write a program to ask user to "Please Enter your pinCode"

						  if the pinCode is valid print out "Welcome to your account "

						  if it is invalid ask again pinCode to verify it

						  Repeat this steps the user enters correct pinCode



 */
    }
}