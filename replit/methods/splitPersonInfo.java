package methods;

import java.util.Scanner;

public class splitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String s) {
        //your code here

        String []info =  s.split(",");

        System.out.println("person name: " + info[0]);
        System.out.println("last name: " + info[1]);
        System.out.println("age: " + info[2]);


    }
}
