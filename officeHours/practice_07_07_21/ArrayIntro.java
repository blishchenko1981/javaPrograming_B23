package practice_07_07_21;

import java.util.Arrays;
import java.util.Locale;

public class ArrayIntro {
    public static void main(String[] args) {

        String[ ] color = {"Yellow", "Blue", "Purple"};

        // retrieve

        System.out.println(color[0]);

        System.out.println("===================");

        int[] num = new int [4];
        num[0] = 4;
        num[1] = 3;
        num[2] = 2;
        num[3] = 1;

        // Arrays method

        //  ===============    Equals  +++++++++++++++++++++++

        int[] num1 = {1,2,3,4};

        System.out.println("Arrays.equals(num, num1)=" +Arrays.equals(num, num1) );


        // ++++++++++++++++++  Sort  ++++++++++++++++++++++++++++++

        Arrays.sort(num);

        System.out.println("Arrays.equals(num, num1)=" +Arrays.equals(num, num1) );

        //++++++++++++++++++++++++    toString     +++++++++++++++++++++++++++++++++

        System.out.println( Arrays.toString(num1));


        // ======================    toChar ======================

        String a = "Cybertek";

        char [] chars = a.toCharArray();
        System.out.println(Arrays.toString(chars));


        // ==========================   Split ======================

        String[] split = a.split("");

        System.out.println(Arrays.toString(split));

        String b = "abcabcabc";
        String [ ] abcs = b.split("abc");
        System.out.println(abcs.length);








    }
}
