package methods;

import java.util.Scanner;

public class cube {
    //your code here
public static void cube(){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int cube = n*n*n;

    System.out.println(cube);
}
    //end cube

    public static void main(String[] args) {

        cube();

    }
}
