import java.util.Scanner;

public class middle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        String result = "";
        int halfWord = word.length() / 2;

        if (word.length() % 2 != 0) {

            if (word.length() >= 3) {
                result = word.substring(halfWord, halfWord + 1);
            } else {
                result = word.substring(0) + word.substring(0) + word.substring(0);
            }
        }

        if (word.length() % 2 == 0) {

            if (word.length() >= 4) {

                result = word.substring(halfWord - 1, halfWord + 1);
            } else {
                result = word + word;
            }
        }


        System.out.println(result);
    }
}


