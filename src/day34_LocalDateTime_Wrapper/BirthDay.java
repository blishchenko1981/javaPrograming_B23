package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class BirthDay {
    public static void main(String[] args) {

        isBirthDay(2008, 7,22);
    }

    public static  void isBirthDay (int year, int month , int day){

       LocalDate DOB  = LocalDate.of(year,month,day);
       LocalDate today = LocalDate.now();
       int age = today.getYear() - DOB.getYear();

       if(DOB.getMonthValue() == today.getMonthValue() &&
               DOB.getDayOfMonth()== today.getDayOfMonth()) {
           System.out.println("Happy Birthday");
           System.out.println(age);
       } else {
           System.out.println("Sorry Not Today , its going to be soon anyway");
       }



    }
}
