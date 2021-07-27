package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,12,13,4,2,0,-12));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 0,5);
        System.out.println(list);
        Collections.replaceAll(list,0,111);
        System.out.println(list);
        int f = Collections.frequency(list, 20);
        System.out.println("f = " + f);

        System.out.println("-----------------------------------");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b', 'c', 'c', 'd', 'a'));
        ArrayList<Character> uniques = new ArrayList<>();

        for(Character each: chars) {
            if(Collections.frequency(chars, each)== 1)
                uniques.add(each);
        }
        System.out.println(uniques);



        // -------------   another way to do so   -----------------------------
        ArrayList<Character> uniques1 = new ArrayList<>(chars);
        uniques1.removeIf((p-> Collections.frequency(uniques, p )!= 1));

        System.out.println(uniques1);

        System.out.println("------------------------------------");
        String str = "avavavabbdxfvyzdeee";
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(result);
        String unique = "";
        for(String each: result ){
            if(Collections.frequency(result,each) == 1){
                unique += each;
            }
        }

        System.out.println(unique);

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int firstMax = Collections.max(list);
        list.removeIf(p-> p == Collections.max(list));
        int secondMax = Collections.max(list);

        list.removeIf(p-> p == Collections.max(list));
        int thirdMax = Collections.max(list);

        System.out.println("thirdMax = " + thirdMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("firstMax = " + firstMax);




    }
}
