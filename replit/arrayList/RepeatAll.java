package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAll {



        //create your method below
public static ArrayList<Boolean> repeatAll (ArrayList<Boolean> list1) {

   ArrayList<Boolean> list2 = new ArrayList<>();
    for (int i = 0; i < 2; i++) {

        for (Boolean aBoolean : list1) {
            list2.add(aBoolean);
        }
    }
    return list2;
}






        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Boolean> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextBoolean());
            }

            System.out.println(repeatAll(list));

        }
    }
