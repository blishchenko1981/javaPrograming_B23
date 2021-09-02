package day51_Abstraction.car;

public final class BMW extends Car{
    public BMW(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }




    @Override
    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Turn the ignition key");
        System.out.println("Give the jump start");
        System.out.println("=======  ___ ==========");
        System.out.println("        /   |          ");
        System.out.println("    ---- BMW ----       ");
        System.out.println("   |-O --------0-|       ");
        System.out.println("Brrrrrrrrrrrrrrrrrrrrrrrrr");

    }
}
