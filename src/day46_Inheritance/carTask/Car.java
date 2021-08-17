package day46_Inheritance.carTask;

public class Car {
    public String brand, model;
    public final int year;
    public double price;
    public String color;
    public long miles;

    public Car(String brand, String model, int year, double price, String color, long miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand + " " + model + " is starting.");
    }

    public void drive(){
        System.out.println(model + "is ready to drive.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
