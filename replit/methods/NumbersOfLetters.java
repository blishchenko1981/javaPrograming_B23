package methods;

import java.util.Scanner;

public class NumbersOfLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String removeDup = "";

        for(int i = 0; i<str.length(); i++ ) {
            if (!removeDup.contains("" + str.charAt(i))) {
                removeDup += str.charAt(i) + "";

            }
        }     //abcd

        String result = "";
            for(int i = 0; i<removeDup.length(); i++ ){// abcde
                int number =0;
                for (int j = 0; j < str.length(); j++) {
                    if (removeDup.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                        number++;
                    }
                }
                result =result +  number + "" + removeDup.charAt(i);//
            }
return result;

    }

}
