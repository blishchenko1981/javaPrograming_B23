package practice_09_06_21;

public class IfElseSmallTask {
    public static void main(String[] args) {
        /*
        4- Create  program to check whether a character is an alphabet or not
                            An input character is an alphabet if it lies in between a-z or A-Z.

                            INPUT : '.'            EXPECTED : Your letter is not in alphabet

                             INPUT : 'a'            EXPECTED : Your letter is in alphabet
         */
        char letter = 't';

        if((letter>= 'a'&& letter<= 'z') || (letter>='A' && letter<= 'Z'))
        {
            System.out.println("Your letter is in alphabet ");
        }else {
            System.out.println("your letter is not in alphabet");}
    }


}
