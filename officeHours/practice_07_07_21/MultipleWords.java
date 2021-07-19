package practice_07_07_21;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {

        String sentence = "knife, wooden spoons, plates, cups, forks, pan," +
                " pot, trash can, fridge, dish washer";

        sentence.split(", ");
        String[] split = sentence.split(", ");

        System.out.println(Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {

            if(split[i].contains(" "))
            {  System.out.println(split[i]);}
        }




    }
}
/*
Task 2 :	Write a program that accepts string and prints multiple
words in the string

        "knife, wooden spoons, plates, cups, forks, pan,
         pot, trash can, fridge, dish washer”

        output : wooden spoons
        		 trash can
         		 dish washer


 */