package day53_Abstractions.carTask;

public class Porsche extends Car implements AutoPark{

    public Porsche( String model, String color, int year, double price) {
        super("Porsche", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Porcse " + getModel());
    }

    @Override
    public void drive() {

    }

    @Override
    public void autoParking() {
        System.out.println("Porsche is autoparking");
    }
}
