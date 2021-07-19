package day13_ScannerContinue;

import java.util.Scanner;// only imports scanner from "java.util" package;
//import jave.util.*; --- imports everithing;
public class CentstoDollars {
    public static void main(String[] args) {

/*
CentsToDollars1. Write a program that can convert cents to dollars,
 if there is any remainder include them in the result as centsEx:
 Enter cents225output:225 cents equal to:
 2 dollars and 25 centsEnter cents300 cents equal to: 3 dolloars
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Cents : ");
        int cents = input.nextInt(); //225
         int dollars = cents/100;
         int remainder = cents%100;

         if(cents>=0 ){
         if(remainder>0) {
        System.out.println("in "+ cents+ " you have "+ dollars + " dollars and "
        + remainder + " cents;");}
         else {
             System.out.println(" In "+ cents + " cents you have " + dollars + " dollars .");
         }
         }else {
             System.err.println("Invalid amount");
         }





    }
}
