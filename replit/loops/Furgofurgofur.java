package loops;

import java.util.Scanner;

public class Furgofurgofur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = word;


        if (count>0){
        for (int i = 2; i <= count; i++) {

            result += separator+ word;
        }

        } else {
            result = "";
             }
        System.out.println(result);

    }
    }
