package employeeTask;

public abstract class  Employee extends Person implements Working  {
    private int ID;
    private int salary;
    private String JobTitle;


    public Employee(String name, String lastName, String city, int ID, int salary, String jobTitle) {
        super(name, lastName,city);
        this.ID = ID;
        this.salary = salary;
        JobTitle = jobTitle;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if(ID<0) {
            throw new RuntimeException("Wrong ID") ;
        }
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle.isEmpty()){
            throw new RuntimeException("Please provide correct Job Title");
        }
        JobTitle = jobTitle;
    }


}
