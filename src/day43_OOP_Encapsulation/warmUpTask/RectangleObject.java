package day43_OOP_Encapsulation.warmUpTask;

import day43_OOP_Encapsulation.Rectangle;

public class RectangleObject {
    public static void main(String[] args) {


        Rectangle rec1 = new Rectangle(-3, 4);
        Rectangle rec2 = new Rectangle(5, 3);

        System.out.println(rec1);

        rec1.setLength(3);
        rec1.setWidth(5);
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec1.equals(rec2));
    }
}
