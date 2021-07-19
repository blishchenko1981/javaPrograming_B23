package Scanner;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your speed:");
        int carSpeed  = input.nextInt();

        if(carSpeed<40 || carSpeed>80){
            carSpeed = 60;
            System.out.println("it is not allowed your speed is 60 ");
        }

        input.nextLine();
        System.out.println("Please enter starting point:");
        String startpoint = input.nextLine();

        System.out.println("Please enter end point:");
        String endpoint = input.nextLine();

        System.out.println("Please enter your distance" + startpoint + "to" + endpoint);

        double distance = input.nextDouble();

        double estimatedTime = distance/carSpeed;


input.close();



    }

}