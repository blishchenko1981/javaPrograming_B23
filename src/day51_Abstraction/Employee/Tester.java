package day51_Abstraction.Employee;

public class Tester extends Employee {
    public Tester(String name, String gender, String jobTitle, int salary, int id) {
        super(name, gender, jobTitle, salary, id);
    }

    @Override
    public void work() {
        System.out.println("Tester testing the sistem for bugs");
    }


}
