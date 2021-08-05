package day40_CustomClassStatic;

import java.util.Scanner;

public class AddressObject {

    public static void main(String[] args) {



        Address address = new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        String building = scan.next();

        scan.nextLine();
        System.out.println("Enter your street name:");
        String street = scan.nextLine();

        System.out.println("Enter your city : ");
        String city  = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip Code:");
        int zipCode = scan.nextInt();

        address.setInfo(building, street, city, state, zipCode);

        System.out.println(address);



    }




}
