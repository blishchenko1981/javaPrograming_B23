package day43_OOP_Encapsulation.warmUpTask;

import day43_OOP_Encapsulation.Cyrcle;

public class ObjectCircle {
    public static void main(String[] args) {


        Cyrcle circle1 = new Cyrcle(5);
        Cyrcle circle2 = new Cyrcle(7);

        System.out.println(circle1);

        System.out.println("area of the circle : "+circle1.area());
        System.out.println("perimeter : " + circle1.perimeter());
        System.out.println(circle1.equals(circle2));

    }
}