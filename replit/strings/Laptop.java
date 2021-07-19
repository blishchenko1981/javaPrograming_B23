package strings;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();

        double price = 0;
        if (screenSize == 13.3) {
            price += 200;
        }
        if (screenSize == 15.0) {
            price += 300;
        }
        if (screenSize == 17.3) {
            price += 400;
        }

        System.out.println("Select CPU type: ");
        String cpu = scan.next();

        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }
        System.out.println("Select RAM size: ");
        int ram = scan.nextInt();
        price  += 50 * (ram / 4);


        System.out.println("Select storage type: ");
        String storageType = scan.next();
        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        switch (storageType) {
            case "HDD":
                price += 50 * (memorySize / 500);
                break;
            case "SSD":
                price += 100 * (memorySize / 500);
                break;
        }


        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();
        switch (screenResolution){
            case "FULLHD":
                price+= 100;
                break;
            case "4K":
                price += 200;
                break;
        }
        System.out.println("strings.Laptop price is: $"+ price);

    }
}
/*
First ask user for a screen size.
- If screen size is equals to 13.3, add  $200 to the laptop price.
- If screen size is equals to  15.0 - add  $300 to the laptop price.
- If screen size is equals to  17.3 - add  $400 to the laptop price.
 */