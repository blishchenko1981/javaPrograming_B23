package day12;

public class Grade {
      /*
    1. a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid

     */

    public static void main(String[] args) {
        char name = 'B';
        String result = "";

        switch (name) {
            case 'A':
                result = "Excelent";
                break;
            case 'B':
                result = "Great job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
                break;

        }
        System.out.println(result);

        /*
        2. write a program that can print any number between 1 ~ 10,
         but for number which is a multiple of 3 print "Fizz" instead of
          the number and for number which is a multiple of 5, print "Buzz"
          instead of the number,
           and for number which is a multiple of both 3 and 5 both
           print "FizBuzz" instead of the number.

                  MUST use switch statement
         */

        int num = 5;// 1-10;
        String result2 = "";

        switch (num) {
            case 3:
            case 6:
            case 9:
                result2 = "Fizz";
                break;
            case 5:
            case 10:
                result2 = "Buzz";
                break;
            case 1:
            case 2:
            case 4:
            case 7:
            case 8:
                result2 = "" + num;
                break;


        }
        System.out.println(result2);


    }

}


