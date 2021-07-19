package day04_Variables;

import javax.swing.undo.StateEdit;

public class EmployeeInfo {
    /*Task:
            1. create a class named EmployeeInfo
                1. declare the following variables:
    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee*/
    public static void main(String[] args) {
         String firstName = "Vitalii";
         String lastName = "Blishchenko";
         String fullName = firstName + " "+ lastName;
        System.out.println("fullName = " + fullName);
        System.out.println("Employee full name is:"+fullName);

        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;

        int salary=100000;

        String gender = "Male";
        System.out.println(fullName+ " is "+ gender);

        int age = 39;

        System.out.println(fullName+ " is "+ age + " years old");

        String companyName = "Microsoft";
        System.out.println(fullName+ " works at "+ companyName);

        System.out.println(fullName+ " job title is "+ jobTitle);
        System.out.println(fullName + "is full time employee? - " + isFullTime);
        System.out.println(fullName +" is married? -"+ isMarried);
        System.out.println(fullName + " salary is "+ salary);








    }






}
