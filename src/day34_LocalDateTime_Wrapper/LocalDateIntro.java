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



    }



}
