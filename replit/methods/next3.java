package methods;

import java.util.Scanner;

public class next3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above

    public static void next3( int num){
        for (int i = 1; i <=3 ; i++) {
           ++ num ;
            System.out.print(num + " ");
        }
    }



}
