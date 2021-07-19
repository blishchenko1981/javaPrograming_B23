package day30_Recap;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
        /*String item = "Eggs",
                item1 = "Milk",
                item2 = "Apple",
                item3 = "Chicken",
                item4 = "Papers";
        */
        String [] items = new String[10];
        items[3] = "Milk";
        System.out.println(Arrays.toString(items));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <=numbers.length -1 ; i++) {
            System.out.println(numbers[i]);
        }


        System.out.println("===================================");

        int [] nums = {10,20,30,40,50};
        int [] result = new int [nums.length];


        for (int i = nums.length-1, j = 0; i >=0 ;j++, i--) {
            result[j] = nums[i];
            System.out.println(nums[i]);







        }
        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------");

        String[] group1 = {"Niks", "Jon", "Mark"};//i
        String []group2 = {"Vitalii", "Blishchenko", "Luchshii", "Molodec"};//j

        String[] group3 = new String[group1.length + group2.length];//k

        int k =0;
        for (int i = 0; i < group1.length ; i++,k++) {

         group3[k] =  group1[i];
        }

        for (int j = 0; j < group2.length ; j++, k++) {

            group3[k]=group2[j];
        }
        System.out.println(Arrays.toString(group3));
    }
}
