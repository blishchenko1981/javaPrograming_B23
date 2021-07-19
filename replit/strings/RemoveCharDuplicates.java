package strings;

import java.util.Scanner;

public class RemoveCharDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String word = "";
        for(int i = 0; i<str.length(); i++){
            if(!word.contains(""+str.charAt(i))){
                word += (str.charAt(i));
            }

        }

        return word;



    }
}
