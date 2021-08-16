package day45_Inheritance.EmployeeTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, long ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void testing(){
        System.out.println(jobTitle + " " +name + " is testing the system");

    }
}
