package day41_CutomClass_Constructor.ScrumTask;

public class Developer {
    String name, jobTitle;
    public char gender;
    public  double salary;
    public static boolean isCybertekStudent;
    public static String companyName;

static {
    isCybertekStudent = true;
    companyName = "Apple";
}

    public Developer(String name, String jobTitle, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }

    public void fixingBugs(){
        System.out.println(name + "is crying like a little baby-girl");
    }
}