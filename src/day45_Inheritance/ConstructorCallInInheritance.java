package day45_Inheritance;


class A{
    public A(){
        System.out.println("A");
    }
}
class B extends A{
    public B(){
     //   super();              this command done by default to call parent class constructor
        System.out.println("B");
    }
}
public class ConstructorCallInInheritance {
    public static void main(String[] args) {
        new B();
    }
}
