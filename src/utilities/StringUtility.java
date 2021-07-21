package utilities;

import java.util.Arrays;

public class StringUtility {
    // reverse any given string, and returns it
    public static String reverse(String stri) {
        String reverse = "";

        for (int i = stri.length() - 1; i >= 0; i--) {
            reverse += stri.charAt(i);
        }

        return reverse;
    }

    // chech if given string is palindrome, returns boolean
    public static boolean isPalindrome(String word) {
        String reversedStr = reverse(word);
        return word.equalsIgnoreCase(reversedStr);
    }

    // remove duplicates method
    public static String removeDuplicates(String str) {
        String newString = "";

        for (int j = 0; j < str.length(); j++) {
            if (!newString.contains("" + str.charAt(j))) {
                newString += str.charAt(j);
            }
        }
        return newString;
    }


    // remove duplicates . 2nd way to do it
    public static String removeDuplicates2(String str) {
        String result = "";

        for (char ch : str.toCharArray()) {

            if (result.indexOf(ch) < 0) {
                result += ch;
            }
        }


        return result;
    }

    // method is ANAGRAM

    public static boolean isAnagram(String str1, String str2) {
        String[] string1 = str1.split("");
        String[] string2 = str2.split("");
        boolean isAnagram = false;
        Arrays.sort(string1);
        Arrays.sort(string2);

        if (Arrays.equals(string1, string2))
            isAnagram = true;


        return isAnagram;
    }


    // method if two strings is ANAGRAM , second method;
    public static boolean isAnagram2(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    // method to get frequency of char ch in the string str
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    // find unique characters in string;
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

    // method to find frequency of Word in  sentence
    public static int frequencyOfWord(String sentence, String word){

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();


        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++ ;
        }

        return count;


    }

    // take string and return only digits from it  "1aaa2fff345ccc" ==> "12345";
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


}