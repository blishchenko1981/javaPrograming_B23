package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 0; i <7; i++) {
            System.out.println("Enter score for judge " +(i+1) +":");
            score[i] = input.nextFloat();
        }


        Arrays.sort(score);
        score[0]=0;
        score[score.length-1] = 0;

         float result =0;

        for (int i = 0; i < 6; i++) {
            result += score[i];
          }

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();

        result = result*difficulty*0.6f;

        System.out.println("Total: " + result);





    }
}
