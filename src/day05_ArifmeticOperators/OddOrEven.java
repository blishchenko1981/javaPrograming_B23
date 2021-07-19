package day05_ArifmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {


        int number = 100;
        boolean isEven = number%2 ==0;// if the remainder of number/2 is equal to 0 ,, then number is even

                boolean isOdd = number%2> 0 ;// Ir the remeinder of vumber/2 it >0 is odd;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number+ " is an odd nymber : "+ isOdd);



    }




}
