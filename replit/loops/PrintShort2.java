package loops;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShort2<resultArr> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] array = str.split(", ");
        String shortest = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].length() < shortest.length()) {
                shortest = array[i];
            }
        }

        int countEqual = 0;
        for (String each : array) {
            if (each.length() == shortest.length()) {
                countEqual++;
            }
        }

        String[] resultArr = new String[countEqual];
            int index = 0 ;
            for (int j = 0; j < array.length; j++) {
                if (array[j].length() == shortest.length()) {
                    resultArr[index++] = array[j];
                }
            }



            Arrays.sort(resultArr);

        System.out.println(Arrays.toString(resultArr));


    }
}
