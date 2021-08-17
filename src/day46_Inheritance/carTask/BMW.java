package day46_Inheritance.carTask;

public class BMW extends Car {

public static boolean isLuxury = true;
    public BMW( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void race(){
        System.out.println(brand + " " + model + " is racing");
    }



}
