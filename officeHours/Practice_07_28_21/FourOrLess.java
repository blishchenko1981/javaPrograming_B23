package Practice_07_28_21;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
            /*
        Task 1 : Four or less
					Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.
					Take those Strings and put them into a different ArrayList
					Ex:
					Input:
					“apples", “tree", “loop, “cat", “animal", “shortcut"
					Output:
					[ tree, loop, cat ]
         */


        ArrayList<String> arr = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));

        ArrayList<String> newArray = new ArrayList<>();
        for (String each : arr) {
            if(each.length()<=4){
               newArray.add(each);
            }
        }
        System.out.println(newArray);
    }
}
