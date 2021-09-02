package day51_Abstraction.car;

public class Tesla extends  Car {

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void autoPilot(){
        System.out.println("Tesla " + getModel() + "is on self driving mode");
    }


    @Override
    public void start() {
        System.out.println("Relax");
        System.out.println("Say \" go go go \" ");
        System.out.println("=======  ______ ==========");
        System.out.println("        /       \\      ");
        System.out.println("    --- Tesla  -----     ");
        System.out.println("   |-(0)--------(0)-|       ");
        System.out.println("brbrbrbrbrrrrrrrrrrrrrr");
    }
}
