package TJMax;

import javax.jws.Oneway;
import javax.print.attribute.HashAttributeSet;

public class main {
    public static void main(String[] args) {


        Item item1 = new Item("shoes", 12, 100,76.3);
        OnSaleItem  sale1 = new OnSaleItem("Hat", 10, 200, 30.1,10);
        TJMaxx tjMaxx = new TJMaxx();
        tjMaxx.addRegularItem(item1);

        tjMaxx.addOnSaleItem(sale1);

        tjMaxx.getRegularItems();
        System.out.println(tjMaxx.getOnSaleItem("Hat"));


        System.out.println(tjMaxx.regularItemsCount());

        System.out.println(tjMaxx.onSaleItemsCount());

        System.out.println(tjMaxx.getAllItemNames());


        System.out.println(tjMaxx.getItemPrice(100));

        System.out.println(tjMaxx.getItemPrice(200));
        System.out.println("tjMaxx.getOnSaleItem(\"Hat\") = " + tjMaxx.getOnSaleItem("Hat"));
       tjMaxx.removeItem(100);
       // System.out.println(tjMaxx.getAllItemNames());

        System.out.println(tjMaxx.getAllItemNames());

        tjMaxx.buyItem(200);
        System.out.println(tjMaxx.getAllItemNames());

        System.out.println("sale1.getQuantity() = " + sale1.getQuantity());

    }
}
