package practice08_04_21.CustomClassIntro;

public class MainMethod {
    public static void main(String[] args) {



        /*
        What is OBJECT?
            - Instance of Class
            - Objects has its own memory
            - We can not create OBJECT without Class
            Car             c               =               new                              Car();
         Class         Object                              keyword to create Object        Constructor
         */


        // Create a OBJECT CustomClass

        CustomClassIntro c=new CustomClassIntro();
        System.out.println("c = " + c);
        System.out.println("================");

        // Call instance Variable
        c.instanceVariable="Instance Variable From Main Class";
        System.out.println("c = " + c);
        System.out.println("================");

        // Call setInfo
        c.setInfo("Instance Variable From SetInfo");
        System.out.println("c = " + c);
        System.out.println("================");

        // Call staticVariable
        CustomClassIntro.staticVariable="Static Variable From Main Class via ClassName";
        //c.staticVariable="Static Variable From Main Class via Object";
        System.out.println("c = " + c);
        System.out.println("================");

        // Call staticmethod
        CustomClassIntro.staticMethod();
        System.out.println("c = " + c);
        System.out.println("================");

        // Call instanceMethod
        c.instanceMethod();
        System.out.println("c = " + c);
        System.out.println("================");

        // Create new Object
        CustomClassIntro c1=new CustomClassIntro();
        System.out.println("c = " + c);
        System.out.println("================");

        // Create new Object
        CustomClassIntro c2=new CustomClassIntro();
        System.out.println("c = " + c);
        System.out.println("================");


        CustomClassIntro.staticVariable="Last value from Main Class";
        System.out.println("c = " + c);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);


    }
}
