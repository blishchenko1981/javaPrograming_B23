package day12;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter number :");
        int num = enter.nextInt();

        System.out.println( (num%2==0)? "even": "odd");
        System.out.println((num>0)? "Positive": (num<0)? "Negative": "zero");






    }
}
