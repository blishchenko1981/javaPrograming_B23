package day37_customClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUP {
    public static void main(String[] args) {

        String[] names = {"Vitalii", "Blishchenko", "Milana", "Artem", "Irina"};


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        System.out.println(students);

        Collections.swap(students, 0, 1);
        System.out.println(students);
        System.out.println("-------------------------------");


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));

        int firstUnique = 0;
        for(Integer each : list) {

            if(Collections.frequency(list,each)== 1 ){
                firstUnique = each;
                break;
            }
        }

        System.out.println("firstUnique = " + firstUnique);

        System.out.println("------------------------------------");

        String str = "AAABCCCDDDDD";
        String result = "";
        String[] strArray = str.split("");

        ArrayList<String> arraylist =new ArrayList<>(Arrays.asList(strArray));
        System.out.println(arraylist);

        for (String each : StringUtility.removeDuplicates(str).split("")) {
            int frequency = Collections.frequency(arraylist,each);

            result += each + frequency;}
        System.out.println(result);

        System.out.println("----------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,5,5,6,6,7,7,7,8,8,9,9,9,9,10,10));

        int n = 5;
        for(int i = 1; i<n; i++ ) {
            numbers.removeIf(p -> p == Collections.max(numbers));
        }
       // Collections.sort(numbers);
        //Collections.reverse(numbers);
        int fifthMaxNum = Collections.max(numbers);

        System.out.println(fifthMaxNum);
    }
}
/*1. write a program that can swap the first and last elements of an ArrayList

        2. write a program that can return the first unique elements of an ArrayList

        3. write a program that can find the frequency of character from a String
        DO NOT use nested loop
        "AABBCCDDEE"  ==> "ABCDE"
        output: A2B2C2D2E2

        4. Write a program that can return the nth largest number from an ArrayList of integers


 */