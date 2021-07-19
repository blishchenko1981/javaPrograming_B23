package day30_Recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers= {100, 200, 399 ,444 ,554};

        for(int each : numbers){
            System.out.println(each);
        }

        System.out.println("---------------------------------");
       int max = numbers[0];
       for (int number : numbers) {
         //  if (number > max) {
         //      max = number;
          // } OR can use Math.max method;


           max = Math.max(number, max); // same Math.min(num1, num2)
       }

        System.out.println("max = " + max);

        System.out.println("==========================================");

        String[] group1 = {"Niks", "Jon", "Mark"};//i
        String []group2 = {"Vitalii", "Blishchenko", "Luchshii", "Molodec"};//j


        String[] group3 = new String[group1.length + group2.length];//k


        int i = 0;

        for (String name : group1) {
            group3[i++] = name;
        }

        for (String name : group2) {
            group3[i++] = name;
        }
        System.out.println(Arrays.toString(group3));





    }
}
