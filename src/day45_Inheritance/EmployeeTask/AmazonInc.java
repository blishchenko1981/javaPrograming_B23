package day45_Inheritance.EmployeeTask;

public class AmazonInc {
    public static void main(String[] args) {

        Tester tester = new Tester("Vitalii", 40,'m',1234567,"SDET", 95000);
        tester.testing();
        tester.eat("steak");
        tester.drink("beer");




        Developer developer = new Developer("Sabir", 35,'m', 654432, "coder",12000);
        developer.sleep();
        developer.eat("Lobster");
        developer.coding();



        Driver driver = new Driver("Ulugbek", 25, 'M', 1234556, "driver", 23433);
        driver.drive();
        driver.drink("Vodka");
        driver.eat("shashlyk");





    }
}
