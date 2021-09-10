package day50;

public class Rectangle {

        private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            throw new RuntimeException("No such a rectangle with a length of : " + length);
        }
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            throw new RuntimeException("No such a rectangle with a width of : " + width);}
        this.width = width;
    }

    public Rectangle(double length, double width) {
            setLength(length);
            setWidth(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double area(){
        return width*length;
    }

    public double perimeter() {
        return (length + width) * 2;
    }


}


