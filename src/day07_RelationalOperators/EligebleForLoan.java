package day07_RelationalOperators;

public class EligebleForLoan {
    public static void main(String[] args) {
        String name = "John";
        int age = 44;

        int income = 309999;
        boolean twoYearExperience = true;
        int creditScore= 754;

        boolean eligibleForLoan = age>= 18 && income>= 60_000 && creditScore>= 700
                && twoYearExperience == true;

        System.out.println(name + " is eligible for loan:  " + eligibleForLoan);





    }





}
