package day51_Abstraction.shapeTask;

public final class Circle extends Shape {

    private double r;
    public final static double PI = 3.14;

    public Circle(double r){
        super("circle");
        setR(r);

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r<=0){
            throw new RuntimeException("invalid radius _" + r);
        }
        this.r = r;
    }

    public double area(){
        return PI*r*r;
    }

    @Override
    public double perimeter() {
        return  PI*2*r;
    }
}
