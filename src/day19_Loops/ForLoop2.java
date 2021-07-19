package day19_Loops;

public class ForLoop2 {
    public static void main(String[] args) {
        // A--Z

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i+" ");
        }

        System.out.println();
        System.out.println("==============================");

        for(char i = 'Z'; i >= 'A'; i --) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("=++++++++++++++=f=d=s==f=sdf=sdfsdf");

        // print the characters from 1000 - 30000 in same line separated by space;

        for (char i = 1000; i <= 30000; i++) {
            System.out.print(i + " ");
        }

    }
}
