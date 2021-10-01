package day57_CollectionRecap;

import utilities.StringUtility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePalindrom {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "kayak", "zaman", "vitalii"));

        Iterator<String> iter = list.iterator();

        while(iter.hasNext()){
            String each = iter.next();  // getting access to each object
            String reverse = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){ // if the string object is palindrome
                iter.remove();
            }


        }

        System.out.println(list);

        System.out.println("--------------------------- easier another way  ---------------------------");

        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList("Java", "Python", "Level", "kayak", "zaman", "vitalii"));


        list2.removeIf(p-> StringUtility.isPalindrome(p));

        System.out.println("list2 = " + list2);


    }
}
