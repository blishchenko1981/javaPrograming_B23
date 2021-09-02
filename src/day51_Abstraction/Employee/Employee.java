package day51_Abstraction.Employee;

public abstract class Employee {
    private String name, gender,jobTitle;
    private int salary;
    private int id;



    public Employee(String name, String gender, String jobTitle, int salary, int id) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void work();
}
