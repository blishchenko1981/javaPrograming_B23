package day13_ScannerContinue;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your first name : ");
        String name = scan.next();// only takes the first word;


        System.out.println(" Enter your last name :");
        String lastName = scan.next();

        System.out.println("name = " +name);

        System.out.println(name+ " " + lastName);








    }
}