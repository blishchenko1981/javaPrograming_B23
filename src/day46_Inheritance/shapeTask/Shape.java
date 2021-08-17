package day46_Inheritance.shapeTask;

public class Shape {
    private final String name;
    public static final boolean isShape, hasArea, hasPerimeter;




    static {
     isShape = true;
     hasArea = true;
     hasPerimeter = true;}

    public Shape(String name) {
        this.name = name;
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "area='" + area() +"perimeter='" + perimeter() ;
    }
}
