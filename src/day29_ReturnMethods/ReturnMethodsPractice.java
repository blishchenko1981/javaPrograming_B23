package day29_ReturnMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        //int max =max(12,43);
        int []  numbers = {12, 34, 3, 2, -5, 0};
        int max = numbers[0];
        int min = numbers[0];

        for (int each: numbers) {
            max = max(each,max);
            min = min(each,min);
        }

        int maximumNum =  maxNumberFormIntArray(numbers);
        System.out.println(maximumNum);
    }
    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }

    public static int min (int a, int b) {
        return (a<b) ? a:b;
    }
    public static int maxNumberFormIntArray(int[] numbers){
        int max= numbers[0];
        int min = numbers[0];
        for (int number:numbers) {
            max = max(max,number);
            min = min(min, number);
        }
        return max;
    }

}
