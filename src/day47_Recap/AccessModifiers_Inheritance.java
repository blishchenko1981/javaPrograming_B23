package day47_Recap;

import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {
    public void method(){

        System.out.println(s1);
        System.out.println(s2);
       // System.out.println(s3);
       // System.out.println(s4); //_ private is never visible outside the package

        method1Public();
        method2Protected();
        //method3Default(); never default visible outside the package
        // method4Private()
    }




}
