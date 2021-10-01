package day57_CollectionRecap;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,2,1,2,4,4,5,55,6,66,6,7,7,8,8,99,0,3));// make sure order after remove duplicates remains SAME

        // convert one collection type to another

       list = new ArrayList<>( new LinkedHashSet<>(list));

        System.out.println(list);


        System.out.println("-------------------------------------------------------------------");


        Integer [] nums = {1,2,3,2,1,2,4,4,5,55,6,66,6,7,7,8,8,99,0,3};

        // converting collection Type to Array data structure
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("-----------------------------------------------------------");

        String [] students = {"Feruza", "Sabir", "Ismail", "Vitalii", "Blishchenko"}; // add Artem;



        ArrayList<String> arrlist = new  ArrayList<>(Arrays.asList(students));

        arrlist.add("Artem");
        // convert Collection to array

        students = arrlist.toArray(new String[0]);

        System.out.println(Arrays.toString(students));

        System.out.println("-------------------------------------------------------");

        Integer[] num = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(num));
        list2.removeIf(p-> p%2 == 0 );

        num = list2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(num));

    }

}
