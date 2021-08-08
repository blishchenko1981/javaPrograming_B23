import java.time.LocalDate;

public class isTodayYourBirthday {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1981, 12, 3);


        if (birthday.getMonthValue() == LocalDate.now().getMonthValue() && birthday.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {

            System.out.println("Happy Birthday");

        } else if (birthday.getMonthValue() == LocalDate.now().getMonthValue() && birthday.getDayOfMonth() < LocalDate.now().getDayOfMonth()
                    || birthday.getMonthValue() < LocalDate.now().getMonthValue()) {

            System.out.println("Sorry you already had birthday this year, you want too much gifts, that is not cool");
        } else if (birthday.getMonthValue() == LocalDate.now().getMonthValue() && birthday.getDayOfMonth() > LocalDate.now().getDayOfMonth()
                    || birthday.getMonthValue() > LocalDate.now().getMonthValue()) {

            System.out.println("No worry you going to have your birthday soon in " );
        }

    }
}
