package day11_Switch;

public class SwitchNameOfMonth {
    public static void main(String[] args) {

        int num = 9;
        String month = "";

        switch (num){
            case 1:
                System.out.println("Jan");

            case 2:
            month= "Feb";
            break;
            case 3:
                month= "Mar";
                break;
            case 4:
                month= "Apr";
                break;
            case 5:
                month= "May";
                break;
            case 6:
                month= "Jun";
                break;
            case 7:
                month = "Jul";
                break;
            case 8:
                month = "Aug";
                break;
            case 9:
                month= "Sep";


            case 10:
                month = "Oct";

            case 11 :
                month = "Nov";


            case 12:
                month= "Dec";
                break;

            default:
                month = "Invalid Month";
                break;






        }
        System.out.println("month = " + month);













    }
}
