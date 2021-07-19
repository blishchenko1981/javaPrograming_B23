package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConvertion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String[] time12 = s.split("");
        String[] time24 = new String[8];

        if (time12[time12.length - 2].equals("A")) {
           if(time12[0].equals("0")){
               time24[0] = "0";
         switch (time12[1]) {

             case "1":
             time24[1] = "1";
             break;
             case "2":
                 time24[1] = "2";
                 break;
             case "3":
                 time24[1] = "3";
                 break;
             case "4":
                 time24[1] = "4";
                 break;
             case "5":
                 time24[1] = "5";
                 break;
             case "6":
                 time24[1] = "6";
                 break;
             case "7":
                 time24[1] = "7";
                 break;
             case "8":
                 time24[1] = "8";
                 break;
             case "9":
                 time24[1] = "9";
                 break;
         }
           }
           if(time12[0].equals("1")){
               switch(time12[1]){
                   case "0":
                       time24[0] = "1";
                       time24[1] = "0";
                       break;
                   case "1":
                       time24[0] = "1";
                       time24[1] = "1";
                       break;
                   case "2":
                       time24[0] = "0";
                       time24[1] = "0";
                       break;
               }


           }

           }


        if (time12[time12.length - 2].equals("P")) {

            if (time12[0].equals("0")) {
                switch (time12[1]) {
                    case "1":
                        time24[0] = "1";
                        time24[1] = "3";
                        break;

                    case "2":
                        time24[0] = "1";
                        time24[1] = "4";
                        break;
                    case "3":
                        time24[0] = "1";
                        time24[1] = "5";
                        break;
                    case "4":
                        time24[0] = "1";
                        time24[1] = "6";
                        break;
                    case "5":
                        time24[0] = "1";
                        time24[1] = "7";
                        break;
                    case "6":
                        time24[0] = "1";
                        time24[1] = "8";
                        break;
                    case "7":
                        time24[0] = "1";
                        time24[1] = "9";
                        break;
                    case "8":
                        time24[0] = "2";
                        time24[1] = "0";
                        break;
                    case "9":
                        time24[0] = "2";
                        time24[1] = "1";
                        break;


                }
            } else if (time12[0].equals("1")) {
                switch (time12[1]) {
                    case "0":
                        time24[0] = "2";
                        time24[1] = "2";
                        break;
                    case "1":
                        time24[0] = "2";
                        time24[1] = "3";
                        break;
                    case "2":
                        time24[0] = "1";
                        time24[1] = "2";
                        break;

                }
            }


            for (int i = 2; i < time24.length; i++) {
                time24[i] = time12[i];
            }

            String result = "";
            for (int i = 0; i < time24.length; i++) {
                result += time24[i];
            }
            System.out.println(result);
        }

    }
}