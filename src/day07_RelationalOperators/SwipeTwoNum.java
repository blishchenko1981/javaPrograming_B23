package day07_RelationalOperators;

public class SwipeTwoNum {
    public static void main(String[] args) {
        /*
        1. write a program that can swipe two variables' value by using a temporary variable
    ex:
        if a= 10, b=15

    output:
        a = 15
        b = 10
        */

        int a = 20, b = 30;
        int c = a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }



}
