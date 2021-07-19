package practice_02_06_21;

public class CastingPractice {
    public static void main(String[] args) {
       /*
       byte< short< int< long< float<double
       TYPE of CAsting:
       1 IMPLICIT CASTING
         double a =5;
         - done by compailer

       2 EXPLICIT CASTING
       double b =5.4;
       int i =(int)b;
       -done by developer
       -bigger to smaller type
       -we can loss data

        */

        long l = 444444444444l;
        int i = (int)l;
        System.out.println("i = " + i);

    }
}
