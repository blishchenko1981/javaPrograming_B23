package day23_Arrays;

public class NestedLoop2_austrax {
    public static void main(String[] args) {

        for (int j = 1; j <=6 ; j++) {


            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==============================================");

        for (int i = 1; i <=8 ; i++) { // i = number of lines
            for (int j = 1; j <=i ; j++) {  // j = number of * in each line
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
