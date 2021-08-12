package utilities;

import day43_OOP_Encapsulation.AccessModifiers;

public class Data {

    public String str1, str2;

    public void method1(){}
    public void method2(){}

    public static String str3, str4, str5;
    public static void method3(){
        System.out.println("Hello");
    }
    public static void method4(){}

    public static void main(String[] args) {
        // System.out.println(AccessModifiers.privateVariable);//  this AM is NOT !!!! reachable outSide package;
      //  System.out.println(AccessModifiers.defaultVariable);//  this AM  IS NOT!!!!reachable outSide package;
        System.out.println(AccessModifiers.publicVariable);//  this AM reachable within outside package;
    }





}
