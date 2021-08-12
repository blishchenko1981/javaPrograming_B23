package day43_OOP_Encapsulation.warmUpTask;

import java.util.ArrayList;
import java.util.Arrays;
import static day43_OOP_Encapsulation.warmUpTask.MyCart.*;

public class CheckOut {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.addAll(Arrays.asList(

                item1,item2,item3, item4, item5
        ));

        double totalCost = 0;

        for (Item item : items) {
           totalCost+=  item.calcCost() * 1.08;
        }

        System.out.println(totalCost + "total cost of cart");
    }
}
