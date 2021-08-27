package day49_Exceptions;

import java.util.stream.Stream;

public class ExceptionHandlings {
    public static void main(String[] args) {

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(200));
        } catch (RuntimeException e){
            System.out.println("String index out of bond exception occured");
        }
        str += " School";
        System.out.println(str);
try {

    System.out.println(9 / 0);
}catch (IllegalArgumentException e){
    System.out.println("IllegalArgumentException");
}   catch (IndexOutOfBoundsException e){
    System.out.println("IndexOutOfBoundsException");
} catch(ArithmeticException e){
    System.out.println("ArithmeticException");
} catch (RuntimeException e){
    System.out.println("RuntimeException");
}

        System.out.println("Test completed");






    }
}
