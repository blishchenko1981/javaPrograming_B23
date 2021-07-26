package arrayList;

    import java.util.ArrayList;
    import java.util.Scanner;

public class CombainAll {
        //create your method below
public static ArrayList<Integer> combineAL(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo) {
    ArrayList<Integer> combineAllNums = new ArrayList<>();

    for (Integer integer : numbersOne) {
        combineAllNums.add(integer);

    }
    for (Integer integer : numbersTwo) {
        combineAllNums.add(integer);

    }



    return combineAllNums;
}








        // Do not touch below


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int size2 = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextInt());
            }
            for(int i=0; i < size2; i++) {
                list2.add(in.nextInt());
            }

            System.out.println(combineAL(list, list2));

        }

    }

