package day26_MultyDementinalArrays;

public class MaxAndMinimum {
    public static void main(String[] args) {
        int[][] numbers = {{10, 20, 30}, {40, 50, 60, 70, 80}};

        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] each1D : numbers) {


            for (int element : each1D) {
                if (element > max) {
                    max = element;
                }
            }


            for (int element : each1D) {
                if (element < min) {
                    min = element; }
            }

        }

        System.out.println(max);
        System.out.println(min);
    }}

/*
 write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10

 */
