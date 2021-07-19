package day31_Recup;

import java.util.Locale;

import utilities.StringUtility;

public class WarmUpTasks2 {

    public static void main(String[] args) {


        String sentence = " run Java java JavA";
        String word = "java";

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();


        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++ ;
        }

        System.out.println(count);

        System.out.println("===============================");
        String sent2 = "cybertek cybe cybertek cybertek cybertek cybertek cybertek";
        String word2 = "cyBertek";

        System.out.println(frequencyOfWord(sent2, word2));

        boolean isPalindrome = StringUtility.isPalindrome(word2);
        System.out.println(isPalindrome);

        sentence = StringUtility.removeDuplicates2(word2);


        System.out.println(sentence);

    }


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
}