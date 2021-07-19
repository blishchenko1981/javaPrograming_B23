package loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yes = "yes";
        String guestName ="";


        while (yes.equals("yes")){
            System.out.println("Please enter guest name:");
            guestName = guestName + ", " + scan.next();

           System.out.println("Do you want to enter new guest name:");
           yes= scan.next();
           System.out.println(yes);

        }
        System.out.println("Guest's list:" + guestName);






    }
}
