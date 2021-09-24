package Day56_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        String [] arr = {"book","pen", "apples","coke", "desk", "pen", "wooden spoon","apples","coke", "desk", };

        Set<String> item = new HashSet<>(Arrays.asList(arr));
        item.add(null);

        Set<String> item2 = new LinkedHashSet<>(Arrays.asList(arr));
        item2.add(null);

        Set<String> item3 = new TreeSet<>(Arrays.asList(arr));
     //   item3.add(null); treeSet does not except the null cz it need to compare value of elements to put them in alphabetic order


        System.out.println("item = " + item);
        System.out.println("item2 = " + item2);
        System.out.println("item3 = " + item3);


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,3,4,5,3,2,4,53,3,6,3,4,3,4,5,3,2,4,3,4,3,4,5,3,2,4,3,4,3,4,5,3,2,4));

       list = new ArrayList<>( new LinkedHashSet<Integer>(list));

        System.out.println(list);
        System.out.println("-----------------------------------------------------");

        String str = "abcdabdccdba";
        str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        System.out.println(str);

        System.out.println("------------------------------------------------------");
        Integer[] nums = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,3,4,5,6,7,8,9};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));
        System.out.println(linkedHashSet);

        System.out.println(new ArrayList<>(linkedHashSet).get(4));

        System.out.println("-------------------------------------------------------");

        String word = "aaaaaaaaaaaavvvvvvvvvvvbbbbbbbbbbdddddd";

         LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(word.split("")));
        System.out.println(linkedHashSet1);

        String result = "";
        for (String s : linkedHashSet1) {
            int count = 0;
           count =  Collections.frequency(Arrays.asList(word.split("")), s);

            result += s + count;
        }
        System.out.println(result);
    }


}
