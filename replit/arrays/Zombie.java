package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        System.out.println(Arrays.toString(inhabitants));
        for (int j = 0; j >=0  ; j++) {


            for ( int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
            }
            System.out.println("Day" + j + Arrays.toString(inhabitants));

            if(inhabitants[0] == 0 &&inhabitants[1] == 0 &&inhabitants[2] == 0
                    &&inhabitants[3] == 0 &&inhabitants[4] == 0 &&inhabitants[5] == 0
                    &&inhabitants[6] == 0 &&inhabitants[7] == 0 ){
                System.out.println("---- EXTINCT ----");
                break;}
        }


    }
}


