package day23_Arrays;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        String[] months = {"No such month ","January", "February", "March" , "April", "May" , "June", "July",
                "August", "September","October", "November", "December"};

        System.out.println("Enter the number:");
        int n = new Scanner(System.in).nextInt();

        System.out.println(months[n-1]);




    }
}
