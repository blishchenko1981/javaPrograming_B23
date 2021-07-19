package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }

        int[] newArr = new int[2];
        if(size<2){
            newArr= num;
        }else {


            for (int i = 0; i < 2; i++) {
                newArr[i] = num[i];
            }
        }
        System.out.println(Arrays.toString(newArr));



    }
}
