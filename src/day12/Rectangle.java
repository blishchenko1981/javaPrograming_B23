package day12;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width of rectangle: ");
        int width = scan.nextInt();

        System.out.println("Enter the length of rectangle: ");
        int length = scan.nextInt();

        int area = length* width;

        System.out.println("area = " + area);
    }



}
