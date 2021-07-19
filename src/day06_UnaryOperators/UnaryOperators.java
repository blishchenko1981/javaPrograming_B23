package day06_UnaryOperators;

public class UnaryOperators {


    public static void main(String[] args) {
        int a = 100;
        ++a;
        System.out.println(++a);
        System.out.println("------------------"
        );


        int n1 = 50;
        int n2 = n1++;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        //n2 = 50;

        int a1 = 100;
        int a2=++a1;
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        int r = 200;

        System.out.println("r = " +r++);
        System.out.println("r = " + r);

        int p = 200;

        System.out.println("p = " + ++p);



       int y = 100;
       int result = y++ +1;
        System.out.println("result = " + result);
        System.out.println("y = " + y);

        int z = 100;
        int result2 = ++z + 1 ;

        System.out.println("result2 = " + result2);
        System.out.println("z = " + z);





    }
}
