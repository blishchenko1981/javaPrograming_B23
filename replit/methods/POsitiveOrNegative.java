package methods;

import java.util.Scanner;

public class POsitiveOrNegative {
    public static void sign(int n){
        //your code here:

        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }



    }


    // DO not change:
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}



