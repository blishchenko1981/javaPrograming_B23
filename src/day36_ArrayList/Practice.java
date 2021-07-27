package day36_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,34,4,122,4,4,5,5,5,6,6,6,6,6,6,6,6,67,88));

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)< 5) {
                list.remove(i);

            }
        }

        System.out.println(list);


        System.out.println("--------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,3,4,4,5,5,6,6,7,4,2,23,2,1,2));

        list2.removeIf(each -> each<5);
        System.out.println(list2);
        list2.removeIf(each -> each%2 !=0);



        System.out.println(list2);

        System.out.println("----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Vitalii", "Irina","Artem", "Milana" , "John", "Jim", "Jimmy"));
        System.out.println(names);
        names.removeIf((name -> name.contains("J")));

        System.out.println(names);

        System.out.println("--------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Vitalii", "Blishchenko", "Ahmat", "Level"));

        words.removeIf(p -> StringUtility.isPalindrome(p));// if the string is palindrome remove it from array list


        System.out.println(words);

     /*   for (String word : words) {

            String reverse = "";


            for (int i = word.length() ; i >= 0; i--) {

                reverse += word.charAt(i);

            }

            boolean isPalindrome = reverse.equalsIgnoreCase(word);

            words.removeIf(p -> p.equalsIgnoreCase(reverse));
        }


      */
    }
}
