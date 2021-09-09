package employeeTask;

public class STED extends Employee implements WorkFromHome{


    public STED(String name, String lastName, String city, int ID, int salary, String jobTitle) {
        super(name, lastName, city, ID, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println("STED working hard to catch the bugs");
    }

    public void sleepOnDesk () {
        System.out.println("Sdet so tired so fall asleep on the desk");
    }

    @Override
    public void WFH() {
        System.out.println("Tester work from home");
    }
}