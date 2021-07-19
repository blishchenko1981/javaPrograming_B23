package day09;

public class MinimumNumber {
    /*
 2. write a program that can print out the minimum number between two Time.numbers

        Ex:
            num1 = 20;
            num2 = 30;

            output:
                20 is the minimum number
     */
    public static void main(String[] args) {
        int num1=20, num2 = 49;

        if( num1>num2){
            System.out.println( num2 + "is minimum" );

        }

        if(num2>num1){
            System.out.println(num1 + " is minimum ");
        }
    }
}
