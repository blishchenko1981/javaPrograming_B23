package utilities;

public class AccessModifier_Inheritance extends Data2{
    // same package: public, protected, default.
    public void method(){

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //System.out.println(s4); _ private is never visible outside the class

        method1Public();
        method2Protected();
        method3Default();
        // method4Private()
        }

}
