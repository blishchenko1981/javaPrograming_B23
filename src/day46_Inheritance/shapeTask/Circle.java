package day46_Inheritance.shapeTask;

public class Circle extends Shape {

      private int radius, diameter;
      private final static double PI=3.14;

    public Circle( int radius, int diameter) {
        super("Circle");
       setRadius(radius);
        setDiameter(radius*2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
        diameter = 2* radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        if(diameter<0){
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }
}
