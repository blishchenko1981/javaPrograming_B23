package day53_Abstractions.carTask;

public class Tesla extends Car implements AutoPilot , ElectricCar, AutoPark{
    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting Tesla "+ getModel());

    }

    @Override
    public void drive() {

        System.out.println("Driving Tesla" + getModel());
    }

    @Override
    public void autoParking() {
        System.out.println("Tesla is autoparking");
    }

    @Override
    public void selfDrive() {

        System.out.println("Tesla is selfDriving");
    }

    @Override
    public void charging() {
        System.out.println("Tesla is on the recharge station ");
    }
}
