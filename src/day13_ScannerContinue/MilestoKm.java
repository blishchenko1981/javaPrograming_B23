package day13_ScannerContinue;

import java.util.Scanner;

public class MilestoKm {
    public static void main(String[] args) {

        /*
        2. Write a program thta can convert Miles to KM1 mile = 1.609 kmEx:
        Enter miles:10.0output:16.09 kilometers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");

        double miles = input.nextDouble();
        double km = miles* 1.609;
        System.out.println(miles+ " miles equal to "+ km + " kilometers;");

        double d = 12.2;
        int s = d<43? 34: 344;


        int a =10;
        a = --a + a++ + a-- + a++;
        System.out.println("a = " + a);
        System.out.println(a=0);

    }
}
