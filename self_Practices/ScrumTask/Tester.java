package ScrumTask;

public class Tester {
    public String name ;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public void setInfo (String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public void smokeTesting(){
        System.out.println("smoke test in proccess");

    }

    public void creatingTicket(){
        System.out.println("Creating ticket");
    }

    public void dailyStandUp(){
        System.out.println("Daily standUp");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
