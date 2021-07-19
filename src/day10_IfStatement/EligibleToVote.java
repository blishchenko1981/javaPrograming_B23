package day10_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 23;
        String citizen = "UA";
        String eligeble = "";

        eligeble= (age >= 18 && citizen== "USA")? "eligible": "not eligible";
        System.out.println("eligeble = " + eligeble);

        System.out.println("=========================");

        int drinkAge = 24;
        String eligible =  ( drinkAge >= 21)? "eligible": "Not eligible";
        System.out.println("eligible = " + eligible);


        System.out.println(" **************Score*******************");
        int score = 64;
        System.out.println( (score>= 60) ? "Pass": "Failed");


        System.out.println(" **************** num ****************");

        int number = 100 ;
        String result3= " ";

        System.out.println((number>4)? "Good": "BAD" );












    }
}
