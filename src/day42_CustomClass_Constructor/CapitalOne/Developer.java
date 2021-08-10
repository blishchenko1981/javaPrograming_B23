package day42_CustomClass_Constructor.CapitalOne;

public class Developer {

    String name, jobTitle;
   public char gender;
    public int employeeID;
    public double salary;

    public Developer(String name,char gender, String jobTitle,  int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
