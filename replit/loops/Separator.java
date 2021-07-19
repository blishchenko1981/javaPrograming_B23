package loops;

import java.util.Scanner;

public class Separator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = "";

        for (int i = 0; i <count  ; i++) {
        word += separator + word;
        }
        System.out.println(word);







    }
}
