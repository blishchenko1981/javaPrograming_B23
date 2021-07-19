package day24_Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // race && care

        String s1 = "heart";
        String s2 = "earth";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1, ch2);

        System.out.println("isAnagram  =" + isAnagram);



    }
}
