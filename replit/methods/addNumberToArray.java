package methods;

import java.util.Arrays;
import java.util.Scanner;

public class addNumberToArray {
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position:
        r= Arrays.copyOf(r, r.length+ 1);
        r[r.length -1] = n;
        System.out.println(Arrays.toString(r));



    }



    // Do not change those lines
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
