package practice_09_06_21;

import java.util.Scanner;
public class Discont {
    public static void main(String[] args) {


    /*;
Task :         A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
                            Create a quantity variable
                            Suppose, one unit will cost 100.
                            Judge and print total cost for user.
                            ( Scanner Class can be used )

                            INPUT for quantity :  5           EXPECTED : No discount applied

                            INPUT for quantiy  :  15    EXPECTED : You get a discount of $discount and
                                     your total cost is $totalCost
     */

        Scanner input = new Scanner(System.in);
        System.out.println("number of items");
        int quantity = input.nextInt();



        double unitPrice = 100;
        double totalCost = quantity * unitPrice;

        double discountRate = 0.1;
        double totalDiscount = 0;

        totalDiscount = discountRate* totalCost;

        if (totalDiscount> 1000) {


            System.out.println( "your discount" + totalCost* discountRate+ " and you total cost is"
                    + (totalCost- totalDiscount));

        } else {
            System.out.println("No discount for you ");
        }


    }
}
