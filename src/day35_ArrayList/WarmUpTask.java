package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];

        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);


        }

        System.out.println(Arrays.toString(dates));


        for(LocalDate day:dates){
            System.out.println(day.format(DateTimeFormatter.ofPattern("MMM/dd  YYYY, EEEE ")));
        }


        }
    }

