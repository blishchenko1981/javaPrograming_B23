package BookShelf;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIstSize {
    public static void main(String[] args) {

        ArrayList <String> check = new ArrayList<>();


        check.add("aa");
        check.add("bb");
        check.add("cc");
        check.add("dd");
        check.add("ee");
        check.add("ff");
        check.add("gg");
        check.add("hh");
        check.add("ii");
        check.add("jj");
        check.add("kk");
        check.add("ll");

        System.out.println(check.size());

        check.clear();
        System.out.println(check.size());

        check.addAll(Arrays.asList("11","22","33", "44", "55", "66", "77", "88", "99", "10", "11", "12"));
        System.out.println("check.size() = " + check.size());

        String [] check2 = {"11","22","33", "44", "55", "66", "77", "88", "99", "10", "11", "12"} ;
        System.out.println("check2.length = " + check2.length);

    }
}
//  result: 12
//        0
//        check.size() = 12
//        check2.length = 12