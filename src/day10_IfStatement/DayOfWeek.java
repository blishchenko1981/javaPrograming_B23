package day10_IfStatement;

public class DayOfWeek {
    public static void main(String[] args) {
        int num = 17;
        String day = "";
if(num>=1&& num<=7) {
    if (num == 1) {
        day = " Monday";
    } else if (num == 2) {
        day = " Tuesday";
    } else if (num == 3) {
        day = " Wednesday";
    } else if (num == 4) {
        day = " Thursday";
    } else if (num == 5) {
        day = " Friday";
    } else if (num == 6) {
        day = " Saturday";
    } else {
        day = " Sunday";
    }
}else {
    day= "No day with such number";
}
        System.out.println("day = " + day);




    }
}
