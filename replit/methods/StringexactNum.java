package methods;

import java.util.Locale;
import java.util.Scanner;

public class StringexactNum {
    public static String extractNum(String s) {

        for (int i = 0; i < s.length(); i++) {

            int num = s.charAt(i);
            if (num < 48 || num > 57) {
                s = s.replace("" + s.charAt(i), "*");
            }


        }
        s = s.replace("" + '*', "");
        return s;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

}

