package day43_OOP_Encapsulation;

public class Cyrcle {
    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println(" It cant be negative");
            return;
        }
        this.radius = radius;
        diameter = (radius * 2);

    }

    public void setDiameter(double diameter) {
        if (diameter < 0) {
            return;
        }
        this.diameter = diameter;
        radius = (diameter / 2);
    }


    public Cyrcle(double radius) {
        setRadius(radius);
    }

    public double area() {
        return radius * radius * PI;

    }

    public double perimeter() {
        return diameter * PI;

    }

    public boolean equals(Cyrcle circle) {
        return radius == circle.radius;
    }


    public String toString() {
        return "Cyrcle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area() +
                ", perimeter=" + perimeter() +

                '}';
    }
}
