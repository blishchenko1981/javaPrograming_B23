package task0308;

import java.util.ArrayList;

public class WallmartStore {
    public String location;
    public double totalWorth;
    public ArrayList<Item> inventory = new ArrayList<>();

    public static String  companyName;

    public WallmartStore(String location) {
        this.location = location;

    }
    public double calculateWorth(){

        for (Item item : inventory){
           totalWorth +=   item.price* item.quantity;
        }
        return totalWorth;

        
    }
}
/*
Create a class called WalmartStore
    -> Instance variables:
        - location (String), totalWorth (double)
        - ArrayList<Item> inventory = new ArrayList();

    -> Static variables:
        - company name (String),

    -> Instance methods:
        - setInfo(): Accepts and initializes location ONLY
        - calculateWorth():Checks inventory, totals up amount of money all the items are worth.
           (each times price * quantity). Stores to the totalWorth variable

        - restockInventory(List of Item) -> Adds the given items to the store inventory.
            Challenge: If the item exists in the inventory already (same item name and price)

        - toString(): returns information of the walmart store (location, total number of inventory, and total worth)
 */