package day15_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Your word is");
        String word = scan.next();
        // index       01234

        String result = "";
        if(word.length()>5){
            result="Too long";

        }else if (word.length()<5){
            result="too short";

        } else {
             result+= word.charAt(4);
            result+= word.charAt(3);
            result+= word.charAt(2);
            result+= word.charAt(1);
            result+= word.charAt(0);
            // OR: result = "" + word.sharAt(4) +word.sharAt(3)+word.sharAt(2)+
            // word.sharAt(1) +word.sharAt(0)

        }
        System.out.println("result = " + result);





    }
}
