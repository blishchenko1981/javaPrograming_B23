package day19_Loops;

public class FinRa {
    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i <=100 ; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");

            }
            System.out.println("=============================================");
result += (i%15 ==0)? "finra ": (i%3 == 0 )? "fin ": (i%5 ==0)? "ra ": i+ " ";

            System.out.println(result);


/*
1. Write a method which prints out the Time.numbers from 1 to 100 butfor Time.numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for Time.numbers which are a multiple of 3, print "FIN" instead of the number and for Time.numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....
 */


        }
    }
}