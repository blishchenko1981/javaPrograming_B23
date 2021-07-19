package day10_IfStatement;

public class FildTrip {
    public static void main(String[] args) {
        int grade = 4;
        String location="";
        int group=0;
        String teacher="";

        if ( grade >=1 && grade <=6 ) { // if grade is valid

            if (grade == 1) {
                location = "Apple orchard";
                group = 3;
                teacher = " Ms. Smith";
            }else if (grade==2){
                location= "Zoo"; group = 7 ;teacher = " Mr. Lee";
            }else if ( grade== 3 ){
                location= "Aquarium"; group = 5 ;teacher = " Mr. Wilson";
            }else if ( grade == 4 ){
                location= "Movie"; group = 2 ;teacher = " Mr.Reyes ";
            }else if ( grade == 5 ){
                location= "Museum"; group = 5 ;teacher = " Mr. Lela";
            }else { location= "Six flag"; group = 2 ;teacher = " Mr. Watt";}




        }else { location = "Unknown"; group = 0 ; teacher = "Unknown";}

        System.out.println("grade = " + grade);
        System.out.println("location = " + location);
        System.out.println("group = " + group);
        System.out.println("teacher = " + teacher);
    }
}
//3. Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
//            Campus is open from 8 am(8) to 11 pm (23)
//            If user enters a time within the open time they should see message : “open” but if the time entered is outside of operating hours they should see: “ closed”
//            If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
//
//    4. Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.
//
//                Data based on grade:
//
//                    grade - 1
//                    location -  Apple orchard
//                    number of groups - 3
//                    teacher in charge - Ms. Smith
//
//                    grade - 2
//                    location - Zoo
//                    number of groups - 7
//                    teacher in charge - Mr. Lee
//
//                    grade - 3
//                    location - Aquarium
//                    number of groups - 5
//                    teacher in charge - Ms. Wilson
//
//                    grade - 4
//                    location - Movie theater
//                    number of groups - 2
//                    teacher in charge - Ms. Reyes
//
//                    grade - 5
//                    location - Museum
//                    number of groups - 5
//                    teacher in charge - Ms. Lela
//
//                    grade - 6
//                    location - Six Flags
//                    number of groups - 8
//                    teacher in charge - Mr. Watt
