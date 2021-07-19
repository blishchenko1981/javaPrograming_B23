package day07_RelationalOperators;

public class MarketGroup {
    public static void main(String[] args) {
       int score = 43;

       boolean earlyBirds = score >= 50 && score<= 60 ;
       boolean group1 = score >= 40 && score<= 50 ;
       boolean group2 = score >= 30 && score<= 40 ;
       boolean angryBirds =  score< 30;

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBirds = " + angryBirds);



    }


}
