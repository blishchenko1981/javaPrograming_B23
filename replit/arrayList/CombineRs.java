package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class CombineRs {
    public static ArrayList<String> combineRs(String[] r1,String[] r2){

        // your code here


        ArrayList<String> r3 = new ArrayList<>();

        r3.addAll(Arrays.asList(r1));
        r3.addAll(Arrays.asList(r2));



        return r3;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }

}

