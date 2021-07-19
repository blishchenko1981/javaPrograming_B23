package day08_ifStatement;

public class LogicalOperators {
    public static void main(String[] args) {



        System.out.println(!true);// false
        System.out.println(true == !false); //true
        System.out.println(true != !true); //true
        System.out.println("=========================");

        int score = 80;
        boolean passed = score >= 60;
        //boolean failed < 60;
       boolean failed = !passed;


        System.out.println("-----------------");

        int age = 21;
        boolean eligible = age >= 21;
        boolean notEligible = !eligible;





    }
}
