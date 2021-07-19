package day11_Switch;

public class OrLogicInSwitchStatement {
    public static void main(String[] args) {
        /*
        28 days: 2;
        30 days: 4,6,9,11;
        31 days: 1 3 5 7 8 10 12


         */
        int number = 1154 ;
        switch (number){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month");
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30 days in this month");
                break;

            case 2:
                System.out.println("28 days in february");
                break;

            default:
                System.out.println("Invalid");
                break;


        }


        System.out.println("------------ Pass or failed____________________");


        char grade = 'u';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");
        }





    }
}
