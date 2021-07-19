package strings;

import java.util.Scanner;

public class personalInfo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //Enter your code here:
        String firstName, lastName, fullName, email, street, state,
                city, address, contacts;

        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information\n" +
                "Enter your first name");
        firstName = scan.next();

        System.out.println("Enter your last name");
         lastName = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your strings.email");
         email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
         street = scan.nextLine();

        // continue for city:
        System.out.println("Enter your city");
         city = scan.nextLine();

        System.out.println("Enter your state");
         state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zip = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean areYouMarried = scan.nextBoolean();

        System.out.println("Patient personal information Full name: "+ lastName+", "+ firstName+" Address: "+ street+", " + city+ ", " + state
                + zip +  "Contacts: work phone number - " +workPhoneNumber + ", personal phone number - " +personalPhoneNumber+ ", strings.email: "+ email + " Age: " + age+" Height: "+ height + " Weight: " + weight+ " pounds Married?: " + areYouMarried);



        scan.close();




    }
}