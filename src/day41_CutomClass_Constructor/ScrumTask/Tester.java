package day41_CutomClass_Constructor.ScrumTask;

public class Tester {
    String name, jobTitle;
    public char gender;
    public  double salary;
    public static boolean isCybertekStudent;
    public static String companyName;

    static {
        isCybertekStudent= true;
        companyName= "Apple";
    }

    public Tester(String name, String jobTitle, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }

    public void smokeTest(String name){
        System.out.println(name + " doing the smoke test");
    }
}
