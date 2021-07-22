package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
public class LocalDateIntro {
    public static void main(String[] args) {

      LocalDate artemBirthDay=   LocalDate.of(2008, 7, 22);
      LocalDate milanaBirthDay = LocalDate.of(2019, 10 , 7 );

        System.out.println(artemBirthDay);
        System.out.println(milanaBirthDay);

        LocalDate today = LocalDate.now();
        System.out.println(today);


        System.out.println("-------------------------------------------");

        String[] classNames = {"Abbas", "Sabir", "Ksenia", "Merve", "Vitalii"} ;

        LocalDate[] DoB = {LocalDate.of(1990, 5, 25),
                LocalDate.of(1981, 6, 15),
                LocalDate.of(1987, 1, 23),
                LocalDate.of(1991, 12, 5),
                LocalDate.of(1981, 8, 3)};

        for(int i = 0 ; i< classNames.length; i++){
            System.out.println(classNames[i] + " birthday is: " + DoB[i]);
        }


        System.out.println("--------------------------------");

        LocalDate DoB1 = LocalDate.of(1981, 8, 3);
        LocalDate DoB2 = LocalDate.of(1981, 5, 25);

        if(DoB1.isBefore(DoB2)){
            System.out.println("DoB1 is older");
        }else{
            System.out.println("DoB2 is older");
        };


        if(DoB1.isAfter(DoB2)){
            System.out.println("DoB1 is younger");
        }else{
            System.out.println("DoB2 is younger");
        }


        System.out.println("-----------------------------------");

        boolean r1 = DoB1.isLeapYear();
        System.out.println(r1);

        boolean r2 = DoB2.isLeapYear();
        System.out.println(r2);

        System.out.println("----------------------------------------");

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

         LocalDate unitAssessment3 = currentDate.plusDays(14);
        System.out.println(unitAssessment3);

        LocalDate unitAssessment4 = currentDate.minusMonths(1);
        System.out.println(unitAssessment4);

        LocalDate weMovedtoUSA = currentDate.minusYears(6).minusDays(24);
        System.out.println(weMovedtoUSA);

    }



}
