package day18_String;

import java.util.Locale;
import java.util.Scanner;

public class word {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = scan.next();

        //  METHOD 1 :
        //  if (word.contains("x")) {
        //    System.out.println( word.replace("x", ""));
        // }

        //METHOD 2:
        if (word.toLowerCase().startsWith("x")) {
            // to ignore the case sensetivity use to LowerCase method;
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }



/*
1. Ask user to enter a word. If the work contains starts with x,
print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */

        scan.close();
    }
}


