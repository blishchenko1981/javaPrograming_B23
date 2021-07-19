package day17_String;

import java.util.Scanner;

public class FirstLastSame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your word");
        String word = scan.next();

        if (word.substring(0,1).equalsIgnoreCase(word.substring(word.length()-1))){
            System.out.println("same");
        }else {
            System.out.println("Different");
        }


scan.close();
          /*  3. write a program that can check if the
          first and last characters of the string are same
        ex:
        level
        output:
        same
        */
    }

}
