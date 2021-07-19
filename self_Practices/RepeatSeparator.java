import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String result = word;
        int i = 1;

        do {
            if (count == 0) {
                result = "";
            }
            i++;

        result +=  separator + word;

        } while (i<count);
        System.out.println(result);








    }
}
