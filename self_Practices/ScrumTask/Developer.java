package ScrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String JobTitle ;
    public double Salary;

    public void setInfo (String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public void coding (){
        System.out.println("Coding in proccess");

    }

    public void unitTesting(){
        System.out.println("Unit testing in proccess");

    }

    public void fixingBug(){
        System.out.println("Fixing bugs ");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
