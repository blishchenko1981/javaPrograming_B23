package day43_OOP_Encapsulation;

public class AccessModifiers {
    public static int publicVariable = 100;
    protected static  int protectedVariable = 1000;
    static int defaultVariable = 200;   // access modifier: default;
    private static int privateVariable = 300;

    public static void main(String[] args) {


        System.out.println(privateVariable);
        System.out.println(defaultVariable);//  this AM reachable within the same class;
        System.out.println(publicVariable);
    }





}




/*interface A {
    public default void m1(){}
}

 */