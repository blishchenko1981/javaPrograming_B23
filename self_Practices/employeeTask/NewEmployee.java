package employeeTask;

public class NewEmployee {
    public static void main(String[] args) throws InterruptedException {
    Working  employee1 = new STED("Vitalii", "Blishchenko", "Charlotte", 100200, 120000, "SDET");
   // employee1.drink
        employee1.work();
       // employee1.getCity();
    Employee employee2 = new STED("Jon", "Humbur", "NY", 100100, 76600, "QA");

    employee2.drink("beer");
        System.out.println("Person.getCity() = " + Person.getCity());
        System.out.println("employee2.getSalary() = " + employee2.getSalary());

        Person employee3 = new STED("Jim", "Bim", "LA", 111222, 132000, "SDET");

        employee3.workingOut("push up",30);
    Working employee4 = new Developer("Asis", "Sou", "SF", 112221, 55544, "developer","java");
    employee4.work();
    employee4.wait();

    }

}
