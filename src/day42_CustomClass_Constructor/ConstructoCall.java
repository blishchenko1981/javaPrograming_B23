package day42_CustomClass_Constructor;

public class ConstructoCall {
    public static void method1(){
        System.out.println("Method1");
    }
   public static    void method2(){
        method1();
       System.out.println("Method2");
   }
   public ConstructoCall(){
        method1();
        method2();
   }





}
