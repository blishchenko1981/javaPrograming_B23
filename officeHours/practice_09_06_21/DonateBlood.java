package practice_09_06_21;

import java.util.Scanner;

public class DonateBlood {
    /*    ( Scanner Class can be used )


                            Create a program that accepts age and weight(kg) as int.

                            If age greater than or equal 18 and weight greater than 50 kg give a message
                                EXPECTED  :  "You are eligible to donate blood"

                            If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
                                EXPECTED  :  "You are not eligible to donate blood"

                            If age is smaller than 18 "Age must be greater than 18"
                                EXPECTED  :  "Age must be greater than 18"

                         */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("age");
        int age = scan.nextInt();
        int weight = 41 ;



        if(age >= 18 ) {
            if (weight >= 50) {
                System.out.println("YOU are eligible to donate blood");

            } else {
                System.out.println(" you are NOT eligible You too skinny");
            }


            }else{
                System.out.println(" you have to be 18 and older");
            }
        }






    }

