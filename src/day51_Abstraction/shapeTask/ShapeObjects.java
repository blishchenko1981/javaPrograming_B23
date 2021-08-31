package day51_Abstraction.shapeTask;

import day46_Inheritance.shapeTask.Shape;

public class ShapeObjects {
    public static void main(String[] args) {
        Shape shape = new Shape("Shape");
      //  Shape shape1 = new day51_Abstraction.shapeTask.Shape()  WE CAN NOT CREATE THE OBJECT FROM ABSTRACT CLASS!!!

        Circle obj1 = new Circle(3.2);
        Square obj2 = new Square(3.2);
        Rectangle obj3 = new Rectangle(3,2);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);


    }
}
