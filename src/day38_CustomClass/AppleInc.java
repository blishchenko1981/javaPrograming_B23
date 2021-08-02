package day38_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Vitalii Blishchenko", 'M', 11, "STED",100000);
        System.out.println(employee1);
        System.out.println("-----------------------------------------------");
        Employee employee2 = new Employee();
        employee2.setInfo("Abbos", 'M', 23, "QA", 100000);
        System.out.println(employee2);

        Employee employee3 = new Employee();
        employee3.setInfo("John", 'm', 234, "QA", 74000);
        Employee employee4 = new Employee();
        employee4.setInfo("Mark", 'M',3432, "CODER", 56000);
        Employee employee5 = new Employee();
        employee5.setInfo("Bread", 'F', 432, "PO", 234443);

        Employee[] arr = {employee1,employee2,employee3,employee4,employee5,};
        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(arr));

        double budget = 0;

        for(Employee each : employees){
            System.out.println(each.name + " : " + each.salary);
            budget += each.salary;
        }

        System.out.println("budget = " + budget);

        System.out.println("--------------------------------------");

        ArrayList<Employee> list1 = new ArrayList<>(employees);

        list1.removeIf(employee -> employee.salary>= 90000);

        for(Employee each : list1) {
            System.out.println(each.name + " : " + each.salary);
        }

        ArrayList<Employee> list2 = new ArrayList<>();

        for(Employee each : employees){
            if(each.jobTitle.equals("QA")){
                list2.add(each);
                System.out.println(each);

            }
        }

        ;

    }
}
