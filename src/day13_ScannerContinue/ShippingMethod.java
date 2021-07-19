package day13_ScannerContinue;

import javax.management.StringValueExp;
import java.util.Scanner;

public class ShippingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*
        building #    nextInt
        street        nextLine
        city          nextLine
        state         next
        zip           next
        name          nextLine

         */
        System.out.println("Enter your building number: ");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street  :");
        String street = scan.nextLine();

        System.out.println("Enter your city:");
        String city = scan.nextLine();

        System.out.println("Your state:");
        String state = scan.next();

        System.out.println("Enter your zip code:");
        String zip = scan.next();

        scan.nextLine();

        System.out.println("your name is:");
        String name = scan.nextLine();

        String shippingInfo = name + "\n" + building + " " + street + "\n"+ city
                + ", " + state + " " + zip;
        System.out.println( name);
        System.out.println( building);
        System.out.println( street);
        System.out.println(city);
        System.out.print( state);
        System.out.println(", " + zip);

        System.out.println( shippingInfo);






    }


}
