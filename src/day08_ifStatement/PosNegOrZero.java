package day08_ifStatement;

public class PosNegOrZero {
    public static void main(String[] args) {
        int num =-40;

        boolean positive = num > 0;
        boolean negative = num <0;
        boolean zero = num== 0;// or !positive && !negative

        if ( positive) {//if the num positive:
            System.out.println(num + " is positive");
        }
        if (negative) { // if the num is negative;

            // or (num<0);
            System.out.println(num + "is negative  ");
        }
        if (zero) //or (num= 0)
        {
            System.out.println(num + " is zero ");
        }






    }



}
