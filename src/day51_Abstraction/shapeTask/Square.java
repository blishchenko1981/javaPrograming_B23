package day51_Abstraction.shapeTask;

public final class Square extends Shape{
    private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<= 0) {
            throw new RuntimeException("Side cant be negative or zero");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }
}
