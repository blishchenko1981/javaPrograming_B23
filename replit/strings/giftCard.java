package strings;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        int price = 0;



        switch (input){
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 15;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;

            case "strings.Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USBcable":
                price = 10;
                break;

            default:
                input = "Invalid item!";
        }
        int currentBalance = 100 - price;

        if (price<= 100 && price>0){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+ currentBalance);
        }else if (price>100){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println(input);
        }


        /*
    Let's say I've got a 100$ gift card and you want to buy something in your online store .
  Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_

> **_List of items_**
> Blanket - 60$
> Charger - 15$
> Hat - 25$
> Headphones - 30$
> strings.Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

Hint: if/ else if / else or switch statement
         */




    }
}
