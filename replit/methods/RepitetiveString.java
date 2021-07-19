package methods;

import java.util.Scanner;

public class RepitetiveString {
    public static int countAppearance(String[] arr,String t){
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(t)){
                n+=1;
            }
        }

        return n;
    } //end  count_appearance




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }
}
