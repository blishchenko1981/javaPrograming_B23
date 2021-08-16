package day45_Inheritance.warmUp;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            System.out.println("side can not be negative");
            return;
        } else if(side>=0){
            this.side = side;

        }

    }

    public Square(double side) {
        setSide(side);


    }

    public double area() {
        return side * side;
    }

    public double perimeter(){
        return side *4;
    }

    public boolean equal(Square square){

        return side == square.side;
        }


    public String toString(){
        return "Square {"+
                "side= " + side+
                "area= " + area()+
                "perimeter= " + perimeter() + "}";

    }


}
