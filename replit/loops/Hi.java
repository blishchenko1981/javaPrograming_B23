package loops;

import java.util.Scanner;

public class Hi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int result = 0;

            while (str.contains("hi")){
                result += 1;
            str = str.replaceFirst("hi", "");}

        System.out.println("result = " + result);
        }

    }

