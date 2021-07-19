package day23_Arrays;

public class FrequencyOfeachCharacters {
    public static void main(String[] args) {

        String str = "aabccc"; // a2b1c3

      // STEP1
        String removeDup = ""; // abc
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (removeDup.contains("" + ch)) { // if the characters is already contained in removeDup
                continue;
            }
            removeDup += ch;
        }// removing duplicates
        System.out.println(removeDup);

        String result = ""; // a2b1c3

        //STEP 3
        for (int j = 0; j <= removeDup.length() - 1; j++) { // outer loop is used for getting each character from String


            // STEP2
            char ch = removeDup.charAt(j);
            int frequency = 0; // for the frequency of ch
            for (int i = 0; i <= str.length() - 1; i++) { // inner loop is for returning the frewuency of ch
                char each = str.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }
            result += " " + ch + frequency;


        }
        System.out.println(result);

    }
}

