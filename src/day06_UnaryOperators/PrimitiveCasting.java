package day06_UnaryOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a =10;
        long b =a; //implicit casting. automatically done

        double d = 10.0;
        int f = (short)d;// explicit casting/ manualy done


        long n = 100 ;
        short m = (byte)n;

        float q = 2.9f;
        int u = (int)q;

        long r = (long) q;
        short s = (short) q;

        System.out.println( (double)q );

        System.out.println( s);




    }






}
