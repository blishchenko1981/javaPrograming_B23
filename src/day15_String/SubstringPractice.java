package day15_String;

import java.util.Locale;

public class SubstringPractice {
    public static void main(String[] args) {

        String sent  = "My favorite TV series is The Walking Dead";
        String tvSeries= sent.substring(25);

        System.out.println("tvSeries = " + tvSeries);

        String practice = "I going to work as hard as possible to end up on good job";

                String result = practice.substring(48).toUpperCase();
        System.out.println("result = " + result);

        String aba ="I will pay 43000$ for the next car and it wont bother me";
        String whatIwillHave = aba.substring(11,18).toLowerCase(Locale.ROOT) + aba.substring(31,34);


        System.out.println("whatIwillHave = " + whatIwillHave);




    }

}
