package methods;

import java.util.Scanner;

public class findStringWithin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here

        String result = "";

        if(main.contains(coverME)){
            result = main.replace(coverME, "[" + coverME + "]");
        }else {
            result = "[" + main + "]";
        }

        return result;
    }
}
