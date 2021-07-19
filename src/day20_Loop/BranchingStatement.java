package day20_Loop;

public class BranchingStatement {
    public static void main(String[] args) {

        System.out.println(" =========== BREAK ==================");
        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("    _____________  continue statement   _________________");

        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;// skip
            }
            System.out.println(i);
        }

        System.out.println("----------------practice---------");
        // print the odd Time.numbers between 1-10. use Continue stnt,

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                continue; // it will skip even Time.numbers;
            }
            System.out.println(i);

        }
        System.out.println("-----------------practice____________________");

        // print all the Time.numbers 1-100 that are evenly divisible by 3 and 5;
        for (int i = 1; i <= 100; i++) {
            if (i % 15 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("-------------------------------------");

        // print alll leters but D. T . X.

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'D'|| i == 'T'||i == 'X') {
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
