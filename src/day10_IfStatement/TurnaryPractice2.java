package day10_IfStatement;

public class TurnaryPractice2 {
    public static void main(String[] args) {
        int number = -0;
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println("result = " + result);

        System.out.println("++++++++++++  Turnary GRADE +++++++++++++++++");
        int score = 98;
        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' :
                (score >= 60) ? 'D' : 'F';
        System.out.println("grade = " + grade);

        System.out.println("-------------------------------------");

        int n = 2;
        String name = " ";
        if (n>=1&& n <= 7 ){
           name=  (n==1)? "Mon" : (n== 2)? "Tue": (n==3)? "Wed": (n== 4)?
                    "Thu": n==5? "Fri": n==6?"Sat":"Sun";

        }
        System.out.println("name = " + name);




    }

}
