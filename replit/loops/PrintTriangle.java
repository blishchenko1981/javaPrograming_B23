package loops;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String tri = "";

        for ( int k=1; k <= n; k++) {

            tri +="*";
            System.out.println(tri);


        }











    }
}
