package day07_RelationalOperators;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Vasisualii Petrion";

        int age= 45;
        String citizen = "USA";

        boolean eligibleVote = age >= 18 && citizen == "USA";
        System.out.println(name + " eligible to Vote = " + eligibleVote);









    }

}
