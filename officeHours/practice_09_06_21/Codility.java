package practice_09_06_21;

public class Codility {
    public static void main(String[] args) {

        /*
         Write a function:
					 that, given a positive integer N  However,
	    		 any number divisible by 2, 3 or 5 shouldbe
				  	 replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

				    			- If a number is divisible by more than
				    			one of the Time.numbers:2,3 or 5, it should be
				    			 replaced by a concatenation of the
				    			 respective words Codility,
				    			  Test and Coders in this given order.

				    			EXPECTED

				    						 Time.numbers divisible by both 2 and 3 should be replacée by CodilityTest
				    						 INPUT : 6    OUTPUT :  CodilityTest

				    			 			 Time.numbers divisible by allthree Time.numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    			 			 INPUT : 15    OUTPUT :  CodilityTestCoders

         */

        int number = 1570;

        String result = "";

        if ( number%2 == 0)
            result += "Sodility";
        if(number%3==0)
            result+= "Test";
        if ( number%5 == 0)
            result += "Coders";


        System.out.println("result = " + result);

    }




}
