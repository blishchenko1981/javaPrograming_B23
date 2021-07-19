package arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] array = sentence.split(" ");

        for (int i = array.length - 1 ; i >=0 ; i--) {

            System.out.print(array[i]);
            System.out.println();

        }




    }
}
