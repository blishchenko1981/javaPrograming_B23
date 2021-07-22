package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {

    public static void main(String[] args) {
        String [] students = {"Ksenia", "Sabir", "Abbas", "Atila", "Vitalii"};

        LocalDate[] DOB = {LocalDate.of(1989, 12,23),
                LocalDate.of(1982, 12,23),
                LocalDate.of(1993, 11,23),
                LocalDate.of(1935, 1,23),
                LocalDate.of(1956, 12,23),
        };

        LocalDate youngest = DOB[0];
        int index = 0;

        for (int i = 0; i < DOB.length; i++) {

            if(DOB[i].isAfter(youngest)){
                youngest = DOB[i];
                index = i;
            }

            if(DOB[i].isLeapYear()){
                System.out.println(students[i]);
            }
        }


        System.out.println(youngest);
        System.out.println(students[index]);


        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EE, MMM/dd/YYYY");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " was born on " + DOB[i].format(DF));
        }



    }
}
/*
Task:
    1. create string array to have 5 of your classmate's names

    2. create an array that contains thier DofB

    3. find out who is the youngest person

    4. find out who was born on leap year

 */