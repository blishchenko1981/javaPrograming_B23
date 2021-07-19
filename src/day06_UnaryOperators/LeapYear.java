package day06_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {
        /* 2. create a class named LeapYear, and write
         a program that can identify if the given is Leap Year,
         print true if it's leap year, otherwise print false
        Ex:
                year = 2020

            output:
                2020 is leap year: true

        Hint: if the number of years can be evenly divisible by 4,
        it's known as the leap year*/

  int year =2085;
  boolean is_a_leapryear = year%4==0;
  // if the year is evenly devisible its leatyear

        System.out.println("Year " + year+ " is a leap year: "+ is_a_leapryear);






    }
}

