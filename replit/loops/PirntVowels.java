package loops;

import java.util.Locale;
import java.util.Scanner;

public class PirntVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        for (int i = 0 ; i< word.length(); i++){
            if(word.toLowerCase().charAt(i)== 'a' ||word.toLowerCase().charAt(i)== 'e' ||
                    word.toLowerCase().charAt(i)== 'y' || word.toLowerCase().charAt(i)== 'o'||
                    word.toLowerCase().charAt(i)== 'u'){
            System.out.print(word.charAt(i));}
        }




    }
}
