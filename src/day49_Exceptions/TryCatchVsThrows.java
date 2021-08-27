package day49_Exceptions;

import day38_CustomClass.employeeTask.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchVsThrows {
    public static void main(String[] args) {
        Employee employee1 = null;
       try{ System.out.println(employee1.salary);
    }catch(RuntimeException e){
           e.printStackTrace();
       }

        System.out.println("step 1 ");
      // method1();

        method2();
    }

    public static void method1 () throws FileNotFoundException {
        new FileInputStream("");
    }

    public static void method2 () {
        try{
            new FileInputStream("");
        }catch (FileNotFoundException e){
            System.out.println("step2");
        }
    }






}
