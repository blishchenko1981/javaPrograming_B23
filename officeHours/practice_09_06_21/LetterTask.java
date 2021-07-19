package practice_09_06_21;

public class LetterTask {
    public static void main(String[] args) {

        /*
        1- Given a character, the task is to check whether the given character is
        in upper case, lower case, or non-alphabetic         character

                            Input: ch = 'A'
                            Output: A  an UpperCisase character

                            Input: ch = 'a'
                            Output: a is an LowerCase character

                            Input: ch = '0'
                            Output: 0 is not an aplhabetic character
         */

        char ch = 'f';

        if (ch>= 'A'&& ch<= 'Z') {
            System.out.println( ch + "an UpperCisase character");

        }else if (ch>= 'a'&& ch<= 'z'){
            System.out.println(ch + "is an LowerCase character");

        }else {
            System.out.println("is not an aplhabetic character");}

    }
}
