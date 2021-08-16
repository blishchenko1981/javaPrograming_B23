package day45_Inheritance.EmployeeTask;

public class Employee extends Person{
    public long ID;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, long ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");

    }
    public void attendMeeting(){
        System.out.println(name + " is attending meeting");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID= #" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
