package day24_Arrays;
import java.util.Arrays;
public class Classmates {
    public static void main(String[] args) {
        String[] classmates = {"vitalu", "Frusa", "Mamer","Jacob", "Furry"};

        System.out.println(Arrays.toString(classmates));

        for (int i = 0; i <=classmates.length-1; i++) {
            System.out.print(classmates[i].substring(0,3) + " ");
        }




    }
}
//1. create string array, and store the names of your  class mates (10)
 //           print the first three characters of each name