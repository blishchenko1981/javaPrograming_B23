package arrays;

import java.util.Scanner;

public class PrintFirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine()};
        String eachWord = "";

        for (int i = 0; i <words.length ; i++) {
           eachWord= words[i];

           eachWord = ""+ eachWord.charAt(0) + eachWord.charAt(eachWord.length()-1);
            System.out.println(eachWord);
        }



    }
}
