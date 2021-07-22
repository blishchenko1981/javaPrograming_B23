package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormating {
    public static void main(String[] args) {
// we want MM/dd/YYYY
//         hh:mm:ss

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");
        LocalDate today = LocalDate.now();
        System.out.println(today);

        String formatedDate = today.format(DF);
        System.out.println(formatedDate);
// ---------------------------------------------------

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime nowIs    = LocalTime.now();
        System.out.println(nowIs);
        System.out.println(nowIs.format(TF));
//-------------------------------------------------------

        LocalTime time1 = LocalTime.of(17, 35);
        System.out.println(time1);
        System.out.println(time1.format(TF));
 //  --------------------------------------------------------

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE MMMM/dd/YY hh:mm a ");
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a.format(DTF));

// ----------------------------------------------------------

        DateTimeFormatter taskForm = DateTimeFormatter.ofPattern(("EEEE,  hh:mm a, MMM/dd/YY "));
        LocalDateTime taskTime1 = LocalDateTime.of(2020, 11,24 ,13,0);

        System.out.println(taskTime1);

        System.out.println(taskTime1.format(taskForm));

        String result = LocalDate.of(2022, 1, 1).format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(result);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(nameOFTheDay(1,1,01));


    }

    public static String nameOFTheDay (int year, int month , int day){

        String result = LocalDate.of(year,month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }
}
