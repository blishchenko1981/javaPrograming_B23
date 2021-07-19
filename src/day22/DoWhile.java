package day22;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i =0;
        do {
            if (i%2 == 0){
                sumOfEven+= i;
            }else{
                sumOfOdd += i;
            }
            System.out.print(i);

            i++ ;
        }while(i<= 10);


        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

        System.out.println("===================");

        Scanner scan = new Scanner(System.in);
        String username = "Jon";
        String pass = "Jon111";
        String u = "";
        String p = "";

        do {
            System.out.println("user");
            u = scan.next();

            System.out.println("pass");
             p = scan.next();
        }while (  !   ( u.equals(username)&& p.equals(pass))     );

        System.out.println("Logged In");

        System.out.println("User");
        u= scan.next();
        int attempts = 0;

        System.out.println("enter ypur password");
        p = scan.next();
         attempts++;

        if (attempts == 3){
            System.out.println("accont locked");
            System.exit(0);
        }





    }
}
