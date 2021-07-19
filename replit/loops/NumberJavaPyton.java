package loops;

import java.util.Scanner;

public class NumberJavaPyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int numOfJava = 0;
        int numOfPython = 0;

       // for (int i = 0; i < sentence.length(); i++) {
           while (sentence.contains("java") || sentence.contains("python")){
            if(sentence.contains("java")){
                numOfJava+= 1;
                sentence = sentence.replaceFirst("java", "");
            }
            if(sentence.contains("python")){
                numOfPython+= 1;
                sentence = sentence.replaceFirst("python", "");
            }


        }

        System.out.println(numOfJava== numOfPython);


    }
}
