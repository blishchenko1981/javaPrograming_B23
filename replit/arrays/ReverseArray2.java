package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: start your code here

        String[] array = sentence.split(" ");

        String newString = "";

        for (int i = array.length-1; i >= 0 ; i--) {
            newString += array[i]+ " ";
        }

        newString = newString.substring(0, newString.length()-1);

        System.out.println(newString);









    }
}
