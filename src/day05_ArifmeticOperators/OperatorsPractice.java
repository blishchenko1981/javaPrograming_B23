package day05_ArifmeticOperators;

public class OperatorsPractice {
    public static void main(String[] args) {

        int num1= -7;
        double num2 = num1/3.0;
        boolean devidedBy3 = num1%3 ==0;
        boolean notDevBy3 = num1%3> 0 ;

        System.out.println( num1 + " we can evenly devide by 3 "+ devidedBy3);
        System.out.println( num1 + " we cant evenly devide by 3 " + notDevBy3);
        System.out.println(num2);




    }


}
