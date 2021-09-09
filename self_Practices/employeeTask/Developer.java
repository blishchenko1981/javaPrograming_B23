package employeeTask;

public class Developer extends Employee{

    public String progLang;
    public Developer(String name, String lastName, String city, int ID, int salary, String jobTitle, String progLang) {
        super(name, lastName, city, ID, salary, jobTitle);
        this.progLang = progLang;
    }

    @Override
    public void work() {
        System.out.println("Developer works hard to do the actual work");
    }

    public void playTetris(){
        System.out.println("developer play tetris");
    }


}
