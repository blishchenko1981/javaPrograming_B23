package Time;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        String subject1 = scan.nextLine();
        double score1 = scan.nextDouble();

        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double score2 = scan.nextDouble();

        scan.nextLine();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.nextLine();
        double score3 = scan.nextDouble();

        scan.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.nextLine();
        double score4 = scan.nextDouble();

        scan.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.nextLine();
        double score5 = scan.nextDouble();

        System.out.println( "Summary: "+ subject1 + " - "+ score1 + ", "+subject2 + " - "+ score2 + ", "+subject3 + " - "+ score3 + ", "+subject4 + " - "+ score4 + ", "+subject5 + " - "+ score5);

        double averageScore = (score1 + score2 + score3+ score4+ score5)/5;

        System.out.println("Your average score is: "+ averageScore);
        System.out.println("Thank you for using Grader! \n Goodbye!");



    }
}
