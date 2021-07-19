package day25_ForEachLoop;

import java.util.Arrays;

public class reversElements {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#"};



        for (int j = 0; j <array.length ; j++) {
            String element = array[j] ;
            String reverse = "";

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);// gets the characters from the string element;
            }
            array[j] = reverse;
        }
        System.out.println(Arrays.toString(array));







    }
}
/*
1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}

	    	output:
	    		["avaJ", "nohtyP", "#C"]
*/
