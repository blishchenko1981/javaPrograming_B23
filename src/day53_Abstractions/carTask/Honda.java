package day53_Abstractions.carTask;

public class Honda extends Car {
    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Honda" + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Honda" + getModel());
    }
}
