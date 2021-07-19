package practice_02_06_21;

public class Personal_Info {
    public static void main(String[] args) {

        String name = "Vitalii";
        String surname = "Blishchenko";
        byte age = 40;
        char gender = 'M';
        boolean isStudent = false;
        short numberOfSiblings =3;
        long favoriteNumber = 3;
        int numbeerOfSeacons = 4;
        double birthDate = 03.08; int year = 1981;
        String fullBirthday = "" + birthDate + "." + year;

        System.out.println("fullBirthday = " + fullBirthday);

        System.out.println("\tname :" + name + "\n\tage :" +
                ""+age+ "\n\tgender :" + gender);


    }
}
