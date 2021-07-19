package strings;

import java.util.Scanner;

public class CountWords {
    public static int wordCount(String words) {
        // your code
        int count = 1;

        for(int i = 0; i< words.length(); i++)

            if(words.contains(" ")){
                count++;

                words = words.replaceFirst(" ", "");
            }


        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
