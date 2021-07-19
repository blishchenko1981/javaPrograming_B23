package day17_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "My favorite programming language are: C#, Java, JavaScript";
        boolean hasJava = sentence.contains("Java");
        boolean hasGoose = sentence.contains("Goose");
        boolean hasjava = sentence.toLowerCase(Locale.ROOT).contains("java");

        System.out.println("hasGoose = " + hasGoose);
        System.out.println("hasJava = " + hasJava);

        System.out.println("hasjava = " + hasjava);

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");

        String sentence2 = "Cybertek School is the best";

        boolean stertWithCybertek = sentence2.startsWith("Cybertek");
        boolean startsWithSchool = sentence2.startsWith("School");

        boolean endWithBest = sentence2.endsWith("best");

        System.out.println("endWithBest = " + endWithBest);
        System.out.println("startsWithSchool = " + startsWithSchool);
        System.out.println("stertWithCybertek = " + stertWithCybertek);






    }

}
