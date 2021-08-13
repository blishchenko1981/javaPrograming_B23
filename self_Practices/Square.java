public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
       setSide(side);
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return side*4;
    }
    public boolean equals(double side){

        return this.side == side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                " area =" + area() +
                " perimeter =" + perimeter() +

                '}';
    }
}
