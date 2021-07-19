package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        // toString
        int[] array  = {1,2,3,4,5,6,};
        System.out.println(Arrays.toString(array));

        String[] array2 = new String[5];
        System.out.println(Arrays.toString(array2));


        int[] nums = new int[5] ;
        System.out.println(Arrays.toString(nums));

        // sort(): sorts the elements of the array in ascending order

        String[] students = {"Vitalii", "Janiffer", "Fiona"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        int[] numbers = {34,345,43,2,35,35,65,6,-44,};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        System.out.println("Min num : " + numbers[0]);
        System.out.println("Max num: " + numbers[numbers.length-1]);


        char[] chars = {'z', 's', 'd', 'g', 'r'};
        System.out.println(Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        // equals(arr1, arr2)
        int [] num1 = {1,2,3};
        int[] num2 = {1,2,3};

        int[] num3 = {3,2,1,};
        int[]num4 = {2,3,1};

        boolean r1 = Arrays.equals(num1,num2);
        boolean r2 = Arrays.equals(num1,num3);

        Arrays.sort(num3);
        Arrays.sort(num4);
        boolean r3 = Arrays.equals(num3,num4);
        System.out.println("r3 = " + r3);


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);






    }
}
