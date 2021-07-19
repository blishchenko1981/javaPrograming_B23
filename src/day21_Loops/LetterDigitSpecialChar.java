package day21_Loops;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {
        String input = "mn@#123Ab!";
        String letters = ""; // mnAb
        String digits = "";   // 123
        String specialChars = "";  // @#!

        for (int i = 0; i <= input.length()-1 ; i++) {
            char each = input.charAt(i);  // GET each character from the String
            if (each >= 'A' && each <= 'Z') {
                letters += each;
            } else if (each >= 'a' && each <= 'z') {
                letters += each;
            } else if (each >= '0' && each <= '9') {
                digits += each;
            } else {
                specialChars += each;
            }

        }
            System.out.println("digits = " + digits);
            System.out.println("letters = " + letters);
            System.out.println("specialChars = " + specialChars);















    }
}
/*
4. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */
