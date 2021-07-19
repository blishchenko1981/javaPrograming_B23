package day22;

import java.util.Locale;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;
        System.out.println("reserne a room?");
        String answer = scan.nextLine().toLowerCase();


        while (! (answer.equals("yes") || answer.equals("no"))){
            System.out.println("Do you want room? or not ?");
            answer = scan.nextLine();
        }

        while (answer.equals("yes")){
            System.out.println("what bed type");
            String bedType = scan.nextLine().toLowerCase();


            if(bedType.equals("king bed")) {
                totalPrice+= 120 ;

            }else if (bedType.equals("queen bed")) {
                totalPrice += 100;

            }else if (bedType.equals("single bed")) {
                totalPrice += 80;
            } else {
                System.out.println("Invalid type");
            }

            System.out.println("do you want another room?");
            answer = scan.nextLine();

        }


        System.out.println("totalPrice = " + totalPrice);

    }
}
