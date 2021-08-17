package day45_Inheritance.warmUp;

import day45_Inheritance.warmUp.Square;

public class SquareObject {
    public static void main(String[] args) {

        Square square = new Square(12);
        Square square1 = new Square(11);

        System.out.println(square);
        System.out.println(square1);

        System.out.println("---------------------------------------------");



        square.setSide(4);
        square.setSide(14);
        square.setSide(40);

        square1.setSide(12.2);
        square1.setSide(15);
        square1.setSide(18);
        square1.setSide(25);


        System.out.println(square);
        System.out.println(square1);

        boolean equal = square.equal(square1);
        System.out.println(equal + " equal squares");

// System.out.println(square.perimeter() + " -perimeter");
        // System.out.println(square.area()+ " -area ");
    }
}
