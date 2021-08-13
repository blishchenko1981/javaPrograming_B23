package day42_CustomClass_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Vitalii");
        Employee employee2 = new Employee("Ivan", "SDET");
        Employee employee3 = new Employee("Milana", "LittleBaby", 10);
        Employee employee4 = new Employee("Artem", "Student", 7, 250000);



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);


    }
}