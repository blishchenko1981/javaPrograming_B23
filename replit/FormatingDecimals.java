import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FormatingDecimals {

    public static void main(String[] args) {
        // (1,3,5,9,11), 6
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 34, 3, 2, 7, 9, 56, 4, 3, 65, 45, 45, 34, 23, 21, 5, 9, 11));
        Integer num = 61;
        arrlist.add(num);
        Collections.sort(arrlist);
        System.out.println(arrlist);
        int result = 0;
        for (int i = 0; i < arrlist.size(); i++) {
            if (arrlist.get(0) == num) {
                result = arrlist.get(1);
                break;
            }
            if (arrlist.get(arrlist.size() - 1) == num) {
                result = arrlist.get(arrlist.size() - 2);
                break;
            }

            if (arrlist.get(i) == num) {
                if ((num - arrlist.get(i - 1)) < (arrlist.get(i + 1) - num)) {
                    result = arrlist.get(i - 1);
                    break;

                } else {
                    result = arrlist.get(i + 1);
                    break;
                }

            }

        }

        System.out.println("result = " + result);
    }
}
