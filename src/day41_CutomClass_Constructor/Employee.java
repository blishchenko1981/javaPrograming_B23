package day41_CutomClass_Constructor;

public class Employee {
public String name, jobTitle;
public double salary;

public Employee(String name, String jobTitle, double salary){
    this.name= name;
    this.jobTitle = jobTitle;
    this.salary = salary;
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
