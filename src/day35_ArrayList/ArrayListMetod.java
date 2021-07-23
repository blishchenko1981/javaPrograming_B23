package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMetod {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Bread");
        groceryList.add("Beer");

        System.out.println(groceryList);

        groceryList.set(0, "Salmon");
        groceryList.set(3, "Beef");

        System.out.println(groceryList);

        boolean hasSlmon = groceryList.contains("Salmon");
        boolean hasSalmon = groceryList.indexOf("Salmon")>=0;

        System.out.println(hasSalmon);
        System.out.println(hasSlmon);


        System.out.println("================================");
        // remove(index)

        groceryList.remove(2);
        System.out.println(groceryList);

        //remove(object);
       boolean r1 =  groceryList.remove("Beef");
        System.out.println(groceryList);
       boolean r2 =  groceryList.remove("Beef");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        System.out.println("============================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        Integer a = 30;
        list1.remove(Integer.valueOf(a));
        groceryList.clear();
        System.out.println("groceryList = " + groceryList);

        list1.clear();
        System.out.println("list1 = " + list1);


        System.out.println("-----------------------------------");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        list.indexOf('A');
        list.lastIndexOf('B');
        ArrayList<Character> uniqueChar = new ArrayList<>();
        for(Character each : list){
            if(list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChar.add(each);
            }
        }

        System.out.println("------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('C');
        characters.add('A');
        characters.add('C');
        characters.add('A');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();

        for(Character each : characters){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("----------------------------------");

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);
        ArrayList<Integer> reversedA = new ArrayList<>();

        for (int i = nums.size()-1; i >=0 ; i--) {
            reversedA.add(nums.get(i));
        }

        System.out.println("reversedA = " + reversedA);

        System.out.println("--------------------------");
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1== n2);
        System.out.println(n1.equals(n2));





    }
}
