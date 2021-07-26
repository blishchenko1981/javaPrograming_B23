package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {

    //create your method below
public static ArrayList<Integer> appendPosSum (ArrayList<Integer> List1){

    ArrayList<Integer> newList = new ArrayList<>();
    for (Integer integer : List1) {
        if(integer > 0) {
            newList.add(integer);
        }
    }
    int sum = 0;
    for (Integer integer : newList) {
        sum+= integer;
    }

    newList.add(sum);
    return newList;
}








    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

}
