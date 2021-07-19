package arrays;

import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortest = str[0];

        for (int i = 0; i < str.length-1; i++) {
            if (str[i].length()< shortest.length()) {
                shortest = str[i];
        }

        }
        System.out.println(shortest);



    }
}
