package day51_Abstraction.car;

public class Garage {
    public static void main(String[] args) {
        Car car1 = new Honda("CRV","navyBlue",2021,32000);
        Tesla car2 = new Tesla("Tesla","x1", "white",2020,200000);
        Honda car3 = new Honda("Accord","grey", 2012, 8000);
        BMW car4 = new BMW("BMW", "x5", "black",2018 , 23000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);


        car1.start();
        car2.start();
        car3.start();
        car4.start();





    }
}
