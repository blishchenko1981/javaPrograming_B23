package day51_Abstraction.shapeTask;

public abstract class Shape {
    private  final String name;

    public Shape(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name= " + name + '\'' +
                "perimeter= " + perimeter() + '\'' +
                "area= " + area() + '\'' +
                '}';
    }
}
