package day45_Inheritance.EmployeeTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, long ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(jobTitle + " " + name + " is fixing bugs");
    }
    public void coding(){
        System.out.println(jobTitle + " " +name + " is writing the codes" );

    }


}
