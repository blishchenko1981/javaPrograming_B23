package day07_RelationalOperators;

public class ShortHand {
    public static void main(String[] args) {


        String name = " John";
        String name2 = " Ivan";

        String name3 = name2; //Save "Ivan"

        name2 = name; // name2 = John ;

        name2 = name3;
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);
        System.out.println("name = " + name);

        System.out.println("         ----------------------------------");


        int a = 200;

        System.out.println("a = " + a);// 200

        a= 100+ 300;
        System.out.println("a = " + a); //400;

        System.out.println("==================================================");


        int balance = 300;
              balance+= 200;


        System.out.println("balance = " + balance);

              balance+= 1000;


        System.out.println("balance = " + balance);

        String school = "cybertek";
        school += " school";


        System.out.println("school = " + school);

        System.out.println("---------------------------------------------" );

        String name1 = "John" ;
        name1+= " Daniel";
        System.out.println("name1 = " + name1);


        System.out.println("================================================");

        //withdraw:

        balance -= 300;
        System.out.println("balance = " + balance);

        System.out.println("====================================");
        //  */ multiplication assignment

        double salary = 100000;
        salary *= 2 ;


        System.out.println("salary = " + salary);

        salary*= 1.5;


        System.out.println("salary = " + salary);

        salary *= 0.65;

        System.out.println("salary = " + salary);

        System.out.println("======================================" );

        //   /=  division assignment

        int slices = 10;

        slices /= 5;

        System.out.println("slices = " + slices);


        System.out.println("=====================================");
        // %= remainder assignment
        // 105 ci
        int cents = 105;
        int quarters = cents/25;
        cents %= 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("**************************************************");












    }








}
