package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        //split METHOD
        String sentense = "I love learning java programming language";

         String[] words = sentense.split(" ");

        System.out.println(Arrays.toString(words));
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println("ddddddddddddddddddddddddddddddddddddddddddddd");

        String email = "blishchenko1981@gmail.com";
        String []name= email.split("1981");
        System.out.println(Arrays.toString(name));

        String firstName = name[0];
        System.out.println("firstName = " + firstName);

        System.out.println("----------   toCharArray method ---------------");
        String str = "ABCDEfsfsdffsdfgr  grdg fgd";
        char[] characters = str.toCharArray();

        System.out.println(Arrays.toString(characters));







    }
}
