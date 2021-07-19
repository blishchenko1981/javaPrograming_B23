package day23_Arrays;

public class FrequencyOFaCharacter {
    public static void main(String[] args) {
        String str = "aabcccd";

        char ch = 'c';
        int frequencyOf_C = 0 ;

        for (int i = 0; i <=str.length()-1 ; i++) {
            char each = str.charAt(i);
            System.out.print(each);

            if(each == ch){
                frequencyOf_C++;
            }




        }
        System.out.println();
        System.out.println("frequencyOf_C = " + frequencyOf_C);














    }
}
/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */