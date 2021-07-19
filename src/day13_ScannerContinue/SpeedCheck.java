package day13_ScannerContinue;

import java.util.Scanner;
/*
3. Write a program for the speed check.a variable named
speedLimit is given and assigned, ask user to enter the current speed,
 if the current speed is over the speedLimit print slow down,
  otherwise do not print anythingEx:speedLimit = 55;
  Enter current speed:105output:
You're driving 50 mph over the limit. Slow down!
 */
public class SpeedCheck {
    public static void main(String[] args) {
         int speedLimit = 35;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your current speed:");
        int currentSpeed = input.nextInt();
        int overSpeedLImit = currentSpeed- speedLimit;
        if (overSpeedLImit> 0 ){
            System.out.println("your are driving " + overSpeedLImit + " miles " +
                    "over speed limit. Slow Down!");


        }






    }
}
