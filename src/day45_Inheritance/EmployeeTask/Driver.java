package day45_Inheritance.EmployeeTask;

public class Driver extends Employee {

    public Driver(String name, int age, char gender, long ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void drive (){
        System.out.println(jobTitle + " " + name + " is driving the car");
    }
}
