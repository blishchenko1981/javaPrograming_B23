package day31_Recup;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {
        String word = "fffffffffffuuuuuuaaaaaaaaaacccccccccccc";

        System.out.println(removeDuplicates2(word));
        String newS = removeDuplicates2(word);
        System.out.println(newS);

        System.out.println("======================");
        String word1 = "google";
        String word2 = "gologle";
        boolean isIt = isAnagram2(word1, word2);
        System.out.println(isIt +" isIt?");

        System.out.println("===========================");

        String s3 = "aaabbcccc";
        String result = "";

        for (char each : removeDuplicates2(s3).toCharArray()) {
            result +=""+each + frequency(s3,each);
        }
        System.out.println(result);

        System.out.println("=================================");
        String s4 = "gheirughdg;sljfgldkgfdkgjd";

        System.out.println(frequencyOfChar(s4));















    }
    // remove duplicates
    public static String removeDuplicates2(String str){
        String result = "";

       for (char ch : str.toCharArray()) {

           if (result.indexOf(ch) < 0) {
               result += ch;
           }
       }



        return result;
    }

    // is anagram
    public static boolean isAnagram2 (String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);



    }

    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    // unique characters
    public static String uniqueChars(String s){
        String unique = "";

        for(int i = 0; i <= s.length()-1; i++){
            char each = s.charAt(i);
            int frequency =  frequency(s, each);
            if(frequency == 1){
                unique += each;
            }
        }

        return unique;
    }

    //frequencyOfChars
    public static String frequencyOfChar (String str){

        String result = "";

        for (char each : removeDuplicates2(str).toCharArray()) {
            result +=""+each + frequency(str,each);
        }

        return result;
    }




}


