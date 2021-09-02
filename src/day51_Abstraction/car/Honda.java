package day51_Abstraction.car;

public class Honda extends Car {


    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Insert the key");
        System.out.println("Turn the ignition key");
        System.out.println("=======  ___ ==========");
        System.out.println("        /   |          ");
        System.out.println("    ---- HONDA---       ");
        System.out.println("   |-0 --------0-|       ");
    }
}
