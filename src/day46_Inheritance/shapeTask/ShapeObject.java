package day46_Inheritance.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Circle circle = new Circle(3,6);
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(12);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle);
        System.out.println("----------------------------------------------");
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle);

        System.out.println("--------------------------------------");
        System.out.println(square);




    }
}
