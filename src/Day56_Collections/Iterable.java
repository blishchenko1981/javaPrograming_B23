package Day56_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,5,5,5,7,8,9,0,9,8,5));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<=5){
                list.remove(i);
            }
        }
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,9,8,5));

        Iterator<Integer> iterator = list2.iterator();
        while(iterator.hasNext()){
            if(iterator.next()<=5){
                iterator.remove();
            }
        }
        System.out.println(list2+ " - list2");
        System.out.println("-----------------------------------------------------------");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,9,8,5));

        list3.removeIf(p->p<=5);
        System.out.println(list3 + " - list3");


    }

}
