package utilities;

public class Data2 {

    public String s1 = "public";
    protected String s2 = "protected";
    String s3 = "default"; // DEFAULT access modifier
    private String s4 = "private";

    public void method1Public(){
        System.out.println("public method");
    }
    protected void method2Protected(){
        System.out.println("Protected method");
    }
    void method3Default(){
        System.out.println("Default");
    }
    private void method4Private(){
        System.out.println("Private");
    }
}
