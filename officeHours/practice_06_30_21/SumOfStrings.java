package practice_06_30_21;

public class SumOfStrings {
    public static void main(String[] args) {

        /*

						  Write a program that can return the sum of digits of an integer
				          (Do not use any string manipulations	)

         */
        int num = 1234;
        int sum = 0;

        while (num> 0){
            sum+= num%10;

            num/= 10;

        }
        System.out.println(sum);






    }
}
