package day10_IfStatement;

import com.sun.org.apache.xalan.internal.utils.FeaturePropertyBase;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 13; //1-12
        String Month = "";
      if(number>=1&& number<=12) {
          if (number == 1) {
              Month = "January";
          } else if (number == 2) {
              Month = "Feb";
          }
          if (number == 3) {
              Month = "March";
          } else if (number == 4) {
              Month = "April";
          } else if (number == 5) {
              Month = "May";
          } else if (number == 6) {
              Month = "June";
          } else if (number == 7) {
              Month = "July";
          } else if (number == 8) {
              Month = "August";
          } else if (number == 9) {
              Month = "Sep";
          } else if (number == 10) {
              Month = "October";
          } else if (number == 11) {
              Month = "November";
          } else {
              Month = "December";
          }
      }else { Month= "No Month Like This ";}
        System.out.println("Month = " + Month);





    }
}
