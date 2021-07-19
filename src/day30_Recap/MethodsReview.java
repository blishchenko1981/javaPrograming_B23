package day30_Recap;

import utilities.StringUtility;

public class MethodsReview {
    public static void main(String[] args) {
        String str = "Java";
       String result =  StringUtility.reverse(str);
        System.out.println("result = " + result);


        String word = "Annay";
        System.out.println(StringUtility.isPalindrome(word));
    }
}
