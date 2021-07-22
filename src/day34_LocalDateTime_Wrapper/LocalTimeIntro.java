package day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {


        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime breakTime = now.plusSeconds(15*60);
        System.out.println(breakTime);

        LocalTime quizeDue = breakTime.plusMinutes(20);
        System.out.println(quizeDue);

    }
}