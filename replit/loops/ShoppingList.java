package loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        for (int i = 1; i <=10 ; i++) {

            System.out.println("Enter task0308.Item" + i +" and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice+= price;
            shoppingListReport += "task0308.Item"+i +": "+item + " Price: " +  price+ "";
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equalsIgnoreCase("no")){
                break;
            }
            shoppingListReport+=", ";

        }

        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);




    }
}
