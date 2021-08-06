package day40_CustomClassStatic;

import day38_CustomClass.employeeTask.Employee;

public class HumanResource {
   public static Employee employee1 = new Employee();
   public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();

    static{
        employee1.setInfo("Vitalii", 'M', 232, "QA", 86000);

        employee2.setInfo("Kseniia", 'F', 43, "QA", 121000);
        employee3.setInfo("John", 'M', 433, "QA", 21000);
        employee4.setInfo("Kurab", 'F', 343, "QA", 101000);
        employee5.setInfo("Leniia", 'F', 3243, "QA", 100000);

    }

}
