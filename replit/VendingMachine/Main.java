package VendingMachine;
import java.util.*;
public class Main {


        public static void main(String[] args) {

            Drink[] drinksParam = {new Drink("Iced Coffee",4.50,10),
                    new Drink("Iced Tea",2.50,5),
                    new Drink("Smart Water",4.0,20),
                    new Drink("Coke",2.30,13)};

            DrinkVendingMachine vending = new DrinkVendingMachine(drinksParam);


            System.out.println( vending.drinks.get(0).toString() ); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
            vending.select(1);

            System.out.println("vending.current = " + vending.current);

            System.out.println("vending.drinks.get(2).getQuantity() = " + vending.drinks.get(2).getQuantity());

            System.out.println(vending.drinks.get(2).toString());
            System.out.println("----------------------------------------");

            vending.select(2);
            System.out.println("vending.current = " + vending.current);

            vending.pay(5.1);
            vending.returnChange();
            vending.select(2);
            System.out.println("current.getQuantity() = " + vending.current.getQuantity());
            System.out.println(vending.drinks.get(2).toString());

            System.out.println("--------------------------------------------------------");

            vending.select(8);      // negative Test


        }
}

