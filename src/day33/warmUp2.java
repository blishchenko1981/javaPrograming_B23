package day33;

import java.util.Arrays;

public class warmUp2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        boolean r1 = isContain(array, 9);

        System.out.println(r1);


    }

    public static boolean isContain(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isContain(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }

        }
        return false;
    }


}
