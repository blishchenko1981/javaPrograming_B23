package day46_Inheritance.carTask;

public class Carshop {
    public static void main(String[] args) {

        Tesla tesla = new Tesla("S", 2020, 35000, "White", 25000);
        Toyota toyota= new Toyota("Camry", 2019, 27000, "Blue", 45000);
        BMW bmw = new BMW("x5", 2021, 56000, "Black", 75000);

        toyota.start();
        tesla.start();
        bmw.start();

        System.out.println(toyota);
        System.out.println(tesla);
        System.out.println(bmw);



    }
}
