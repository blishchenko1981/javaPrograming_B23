package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        Integer num = 10;
        int num1 = num;// unboxing;
        long num2 = num;// unboxing;
        double num3 = num;// unboxing;



        byte c1 = 10;
        Byte c2 = c1;// autoboxing , wrapper accept only own primitive
        //Short c3 = c1;
        //Integer c4 = c1; // will give compile error
        // Double c5 = c1;  compile error as well;
    }
}
