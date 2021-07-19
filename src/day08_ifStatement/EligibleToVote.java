package day08_ifStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = " john ";
                int age = 23;

        String citizen = "UA";

        boolean eligibletoVote = age>= 21 && citizen== "USA";

        if (eligibletoVote) {
            System.out.println(name + " is eligible to vote ");
        }
        if (!eligibletoVote) {
            System.out.println(name + " is NOT eligible to vote");
        }



    }
}
