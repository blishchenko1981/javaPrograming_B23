package day57_CollectionRecap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class removeEven {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,3,2,5,4,2,7,5,4,10,10,10,3,2,5,4,2,7,5,4));

        System.out.println(set);

       Iterator<Integer>  iter1 =  set.iterator();
        while(iter1.hasNext()) {

            if(iter1.next()%2 == 0){
                iter1.remove();
            }

        }

        System.out.println(set);

        System.out.println("--------------------------------------------------------------");

        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(10,10,10,3,2,5,4,2,7,5,4,10,10,10,3,2,5,4,2,7,5,4));

        set2.removeIf(n-> n%2 == 0);
        System.out.println(set2);








    }
}
