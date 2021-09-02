package day51_Abstraction.car;

public class Audi extends Car{


    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Get in the car");
        System.out.println("Push the Start button");
        System.out.println("=======  ___ ==========");
        System.out.println("        /   |          ");
        System.out.println("    ----     ----       ");
        System.out.println("   |-0 --------0-|       ");
    }
}
