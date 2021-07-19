package day29_ReturnMethods;

public class ReturnMethodsPracticeTwo {

    public static void main(String[] args) {
       grade(59);

       String r = grade1(87);
        System.out.println(r);


    }
    public static void grade(int score){
        if(score> 100 || score< 0){
            System.out.println("Invalid");
            return;
        }

        if(score>= 90){
            System.out.println("A");
        }else if(score>= 80){
            System.out.println("B");
        }else if(score>= 70){
            System.out.println("C");
        }else if(score>= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }

    public static String grade1 (int score){
        String result = "Invalid";

        if(score<= 100 || score>= 0) {


            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result="B";
            } else if (score >= 70) {
                result="C";
            } else if (score >= 60) {
           result = "D";
            } else {
                result = "F";
            }

        }
        return result;
    }



}
