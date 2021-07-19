package day09;

public class DaysInMonth {
    /*
     3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
     */

    public static void main(String[] args) {
        int month=9;
        boolean has28Days= month == 2;
        boolean has30Days= month ==4|| month==6|| month == 9|| month==11;
        boolean has31Days = has28Days==false && has30Days==false;
                      //or =!has28Days&&!has30Days;*********************

        if(has28Days){
            System.out.println( month+ "th month has 28 days" );

        }
        if (has30Days){
            System.out.println(month+ "th month has 30 days");
        }

        if(has31Days){
            System.out.println(month+ "th month has 31 days ");
        }





    }
}
