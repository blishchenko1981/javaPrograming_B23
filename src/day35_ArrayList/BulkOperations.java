package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7));


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(Arrays.asList(11,22,33,44,55,66,77));

        System.out.println(list);

        System.out.println("---------------------------------------------");
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Vitalii","Artem", "Blishchenko", "Artem","Vitalii","Artem", "Milana", "Vitalii","Irina"));

        students.removeAll(Arrays.asList("Vitalii","Artem"));
        System.out.println(students);

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,3,22,3,2,3,3,2,3,2,3,23,2,32,3,11,23,3,2,1,3,3,4,4,3,4,3));
        System.out.println("nums = " + nums);


        nums.removeAll(Arrays.asList(1,2,3));
        System.out.println("nums = " + nums);

        nums.retainAll(Arrays.asList(22,23,32));
        System.out.println(nums);

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Vitalii","Artem", "Blishchenko", "Artem","Vitalii","Artem", "Milana", "Vitalii","Irina"));

        employees.retainAll(Arrays.asList("Vitalii", "Blishchenko"));
        System.out.println(employees);


        System.out.println("-----------------------------------------------");
        ArrayList<String> groseryLIst = new ArrayList<>();
        groseryLIst.addAll(Arrays.asList("soda", "beer", "bread", "carrot", "water","salmon", "papper towel"));
        // soda, wine, beer <----items to check

        boolean toCheck = groseryLIst.containsAll(Arrays.asList("soda", "wine", "beer"));

        System.out.println("toCheck = " + toCheck);



    }
}
