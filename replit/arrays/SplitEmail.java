package arrays;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int cont = 0;
        for (int i = 0; i < email.length()-1; i++) {
            if (email.charAt(i)=='@'){
                cont += 1;
            }
        }
        if (cont == 1){

             String [] array = email.split("@");

            System.out.println("Email id: "+array[0]);
            System.out.println("Email domain: "+ array[1]);
        } else {
            System.out.println("invalid email");
        }

    }
}
