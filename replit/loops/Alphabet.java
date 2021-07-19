package loops;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        System.out.println(start);
        for( char i = start; i<= end; i++){

            System.out.print(i);
        }
    }
}
