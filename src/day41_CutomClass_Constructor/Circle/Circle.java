package day41_CutomClass_Constructor.Circle;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI;
    static {
        PI = 3.14;
    }

    public Circle(double radius){
        this.radius= radius;
        diameter = 2* radius;
    }

    public double area(){
        return radius * radius* PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area = " + area() +
                "perimeter=" + perimeter() +
                ", diameter=" + diameter +
                '}';
    }
}
