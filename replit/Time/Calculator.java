package Time;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String ifSplit = scan.next();

        System.out.println("Number of people:");
        int numberOFPerson = scan.nextInt();
        String people = "";
        for (int i = 0; i < numberOFPerson; i++) {
            people += "&";
        }

        System.out.println("Check amount:");
        double check = scan.nextDouble();

        System.out.println("Service Quality:");
        String qualityOfService = scan.next();

        double totalPay = 0, totalTip = 0, totalPerPerson = 0, tipPerPerson = 0;

        switch (qualityOfService) {
            case "Poor":
                totalTip = check * 0.05;
                break;
            case "Fair":
                totalTip = check * 0.1;
                break;
            case "Good":
                totalTip = check * 0.15;
                break;
            case "Great":
                totalTip = check * 0.2;
                break;
            case "Excellent":
                totalTip = check * 0.25;
                break;
        }

        totalPay = check + totalTip;

        if (ifSplit.equalsIgnoreCase("yes")) {
            totalPerPerson = totalPay / numberOFPerson;
            tipPerPerson = totalTip / numberOFPerson;
        }

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);


    }
}