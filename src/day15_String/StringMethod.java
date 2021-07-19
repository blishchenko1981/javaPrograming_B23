package day15_String;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Muhtar";
                 //   012345
        char ch = str.charAt(0);
        System.out.println("ch = " + ch);


        String word = "Cybertek School";
        //             0123456789
        char sh1 = word.charAt(0);
        char ch2 = word.charAt(9);
        System.out.println(sh1+""+ch2);

        System.out.println("===================================");

        String sentence = "Hello everyone . How are you all today?";

        int totalNumberOfchars= sentence.length();
        System.out.println("totalNumberOfchars = " + totalNumberOfchars);

        String s1 = "Cybertek School";
        // index     01234567
        int lastIndex = s1.length()-1;// in order to get last index we need
        // to subtract 1 from the lengh;
        char firstChar = s1.charAt(0);
        char last = s1.charAt(lastIndex);

        System.out.println("firstChar = " + firstChar);
        System.out.println("last = " + last);

        System.out.println("ffffffffffffffffffffffffffffffffffffffff");

        String w = "cybertek";
             w=  w.toUpperCase();// new String object going to be created;

        System.out.println( w);

        System.out.println("---------- TO LOWER CASE--------------");

        String s2= " JAVA IS PROGRAMMING LANGUAGE";
        s2=s2.toLowerCase();// java programming language

        System.out.println(s2);

        System.out.println("================== trim ======================");
        String school = "    Cybertek       School       ";
        school = school.trim();// "Cybertek School"

        System.out.println( school);

        System.out.println("---------- Replace +++++++++++++++++++++");

        String sentence3 = "Python is an easy language";
        sentence3= sentence3.replace("Python", "Java");

        System.out.println(sentence3);

        String sentence4 = "C# is a programming language, I like learn C#, C# is best ";
        sentence4 = sentence4.replace("C#", "Java");

        System.out.println("sentence4 = " + sentence4);


        String sentence5 = "Dog is friendly,Dog is loyal so I love Dogs";
        sentence5= sentence5.replace("Dog", "Fish");
        System.out.println("sentence5 = " + sentence5);

        System.out.println("-------------------------------");

        String str4 = "Batch 23";
        char ch1= str4.charAt(2);
        System.out.println("ch1 = " + ch1);













    }
}
