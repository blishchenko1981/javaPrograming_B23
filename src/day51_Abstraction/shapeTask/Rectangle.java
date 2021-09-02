package day51_Abstraction.shapeTask;

public final class Rectangle extends Shape {


    private double width;
    private double length;

    public Rectangle(double width, double length) {
        super("rectangle");
        setLength(length); //this.length = length;
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Invalid width " + width);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid length " + length);
        }
        this.length = length;
    }


    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return (length + width ) *2;
    }
}
