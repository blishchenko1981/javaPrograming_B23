package strings;

import java.util.Scanner;

public class FreakingTime {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            timeConversion(scan.nextLine());
        }

        public static void timeConversion(String s) {

            if (s.substring(s.length()-2).equals("AM")){

                if(s.substring(0,2).equals("12")){
                    s= s.replaceFirst("12", "00");
                }
                }

            if (s.substring(s.length()-2).equals("PM")){
                switch (s.substring(0, 2)){

                    case "2:":
                        s = s.replaceFirst("2", "14");
                        break;

                    case "01":
                        s = s.replaceFirst("01", "13");
                        break;
                    case "02":
                        s = s.replaceFirst("02", "14");
                        break;
                    case "03":
                        s = s.replaceFirst("03", "15");
                        break;
                    case "04":
                        s = s.replaceFirst("04", "16");
                        break;
                    case "05":
                        s = s.replaceFirst("05", "17");
                        break;
                    case "06":
                        s = s.replaceFirst("06", "18");
                        break;
                    case "07":
                        s = s.replaceFirst("07", "19");
                        break;
                    case "08":
                        s = s.replaceFirst("08", "20");
                        break;
                    case "09":
                        s = s.replaceFirst("01", "21");
                        break;
                    case "10":
                        s = s.replaceFirst("10", "22");
                        break;
                    case "11":
                        s = s.replaceFirst("11", "23");
                        break;

                }




            }


            s = s.substring(0, s.length()-2);
            System.out.println(s);
            }
        }
