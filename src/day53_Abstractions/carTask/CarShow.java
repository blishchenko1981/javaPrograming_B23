package day53_Abstractions.carTask;

public class CarShow {
    public static void main(String[] args) {


        Honda honda = new Honda("Civic", "dark blue", 2018, 19500);
        Porsche porsche = new Porsche("Cayman", "red", 2017, 68000);
        Tesla tesla = new Tesla("S", "blue", 2021, 120000);

        honda.drive();
        honda.start();
        porsche.autoParking();
        porsche.drive();

        tesla.charging();
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoParking();
        tesla.charging();


    }
}
