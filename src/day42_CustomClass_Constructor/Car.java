package day42_CustomClass_Constructor;

public class Car {
    public String make, model, color;
    public int year;
    public double price;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
        year = 2000;
        price = 20000;
        color = "White";
    }

    public Car(String make, String model,  int year) {
        this(make,model);
        this.color = "Black";
        this.year = year;
        price = 30000;
    }

    public Car(String make, String model, String color, int year, double price) {
       this("Honda", "Accord");
        this.color = color;
        this.price = price;
    }

    public Car(int year, double price) {
        this("unknown", "unknown", year);

        this.price = price;
    }
}
