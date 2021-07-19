package day24_Arrays;

import java.util.Arrays;
public class Grade {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah", "Ksenia", "Sabir","Atila"};
        int [] scores = {83, 75, 80, 96,87,96};
        char [] grades = new char[names.length];

        int countOfA = 0;
        int countOfB = 0;
        int countOfC = 0;

        for (int i = 0; i <= grades.length- 1 ; i++) {


            int score = scores[i];
            if (score >= 90) {
                grades[i] = 'A';
                countOfA += 1;
            } else if (score >= 80) {
                grades[i] = 'B';
                countOfB++;
            } else if (score >= 70) {
                grades[i] = 'C';
                countOfC++;
            } else if (score >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

            System.out.println(names[i] + " score: " + scores[i] + "points, its in grade:" + grades[i]);
        }

        System.out.println("countOfA = " + countOfA);
        System.out.println("countOfB = " + countOfB);
        System.out.println("countOfC = " + countOfC);

    }
}
/*
2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];
 write a program that can store the gardes of the students in the array named grades

 */