package day39_CustomClass_Staics.circleTask;

import java.text.DecimalFormat;

public class Circle {
    public double radius, diameter;
    public static double PI = 3.14;

    public void setInfo (double radius){
        this.radius = radius;
        diameter = 2* radius;
    }
    public double area() {
        return radius * radius * PI;

    }
    public double perimeter (){
        return diameter * PI;
    }


    public String toString() {

        DecimalFormat df = new DecimalFormat("0.0");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area()) +
                ", perimeter=" + df.format(perimeter()) +
                '}';
    }
}
