package day42_CustomClass_Constructor.warmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemObject {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
               new Item("filter",12.75, 10 ),
                new Item("toy",2.75, 3 ),
                new Item("beer",15.05, 2 ),
                new Item("soap",8.75, 5 ),
                new Item("bread",2.15, 6 )

        ));

        items.removeIf(item -> item.unitPrice>3);

        double totalPrice = 0;
        for(Item item : items) {
           totalPrice += item.castCost();
        }


        System.out.println(totalPrice+" totalPrice");
    }
}
