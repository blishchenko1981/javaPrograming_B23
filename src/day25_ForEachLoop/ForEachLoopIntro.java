package day25_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5} ;

        for( int each : numbers) {


            System.out.println(each);
        }

        System.out.println("---------------------------------------------");

        String[] names = {"Ahmat", "Vitali", "Blishchenko", "Atrem"};

        for (String eachNames : names) {
            System.out.println(eachNames);
        }

    }
}
