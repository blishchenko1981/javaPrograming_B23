package day13_ScannerContinue;

import java.util.Scanner;
/*
       FreeShippig
           price
           isPrime:
                true : free shipping
                false: 3.99 shipping fee

        */
public class FreeShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Price of the item.");
        double price = input.nextDouble();

        System.out.println(" Are you a prime member? ");

        boolean isPrime = input.nextBoolean();
        double totalPrice = (isPrime)? price : (price>=25)? price: price+ 3.99;
        System.out.println("Total price = $"+ price);





    }


}
