package Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
         ArrayList<Candy> CandyList = new ArrayList<>();
         Candy[] candies = {new Candy("Roshal", 20, 15.35, false),
                 new Candy("Snickers", 20, 15.35, false ),
                 new Candy("R&H", 20, 15.35, false ),
                 new Candy("Chesterfield", 20, 15.35, false ),
                 new Candy("RotFront", 20, 15.35, false )};
         CandyList.addAll(Arrays.asList(candies));



        for (Candy candy : CandyList) {
            System.out.println( candy.getBrand());
            System.out.println(candy.getPrice());
        }

    }
}
