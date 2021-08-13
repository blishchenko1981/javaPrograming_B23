package day42_CustomClass_Constructor;

public class Employee {
    public String name, JobTitle;
    public int id;
    public double salary;

    public  Employee(String name){
        this.name = name;
        JobTitle= "Unknown";
    }
    public Employee(String name,String jobTitle ){
        this(name);
        this.JobTitle = jobTitle;

    }

    public Employee(String name, String jobTitle, int id) {
      this(name,jobTitle);
        this.id = id;
    }

    public Employee(String name, String jobTitle, int id, double salary) {
        this(name,jobTitle,id);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
