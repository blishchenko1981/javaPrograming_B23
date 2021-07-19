package practice_02_06_21;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

public class Relational_Unary_Shorthand_Operators {

    public static void main(String[] args) {
        boolean cond = true;
        int a =10, b = 10;

        System.out.println("+++++++DATA+++++++++");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("cond = " + cond);


        System.out.println("+++++++++++Unary Operator+++++++++");

        System.out.println("cond = " + !!cond); //true

        System.out.println("a++ :"+ a++ );
        System.out.println("a = " + a);
        System.out.println("b = " + ++b);

        System.out.println(--a);
        System.out.println("b = " + b--);
        System.out.println("b = " + b);

        System.out.println("++++++++++Relational Operators++++++++++++++");

        System.out.println(a>b);
        System.out.println(a);

        System.out.println("========Shorthand Operators==========");

        //a = a+ b;
        a+= b;
        System.out.println("a = " + a);

        String name ="Cybertek";

        name = name + " School ";

        name+= " school";
        System.out.println("name = " + name);



    }
}
