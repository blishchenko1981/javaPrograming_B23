package day23_Arrays;

public class HighestScore {
    public static void main(String[] args) {

        int[] numbers = {85,70, 95, 90,100, 454};
        String names[] = {"Mike", "Abrams", "Tonny", "John", "Ammy", "Valeri"};

        int maxScore = numbers[0];
        int minScore  = numbers[0];
        String minName = "";
        String maxName="" ;
        for (int i = 0; i <numbers.length ; i++) {

            String eachName = names[i]; // gets each name from the array
            int eachScore = numbers[i]; // gets each number from array

            if( eachScore>maxScore){// used for comparing the scores to assingn the maximum score to maxScore
                maxScore= eachScore;
                maxName = eachName;
            }

            if(eachScore<minScore) {
                minScore =eachScore;
                minName = eachName;
            }

        }
        System.out.println("maxName = " + maxName);
        System.out.println("maxScore = " + maxScore);
        System.out.println("--------------------------");
        System.out.println("minName = " + minName);
        System.out.println("minScore = " + minScore);




    }
}
