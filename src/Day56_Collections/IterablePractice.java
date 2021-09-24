package Day56_Collections;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("jim", "john", "fred", "joue", "july", "frank"));

        Iterator<String > it = names.iterator();
        while (it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("jim")){
                it.remove();
            }
        }
        System.out.println("names = " + names);

        System.out.println("----------------------------------------------------");

        List<String> names2 = new ArrayList<>(Arrays.asList("jim", "john", "fred", "joue", "july", "frank"));

        names2.removeIf(p-> p.equalsIgnoreCase("john"));
        System.out.println("names2 = " + names2);

        System.out.println("----------------------------------------------------");

        Set<Integer> set = new HashSet<>(Arrays.asList(11,22,1,2,3,4,3,2,5,3,44,33));

        for(Iterator<Integer> i = set.iterator(); i.hasNext();){
            if(i.next()<13){
                i.remove();
            }
        }

        System.out.println("set = " + set);

    }
}
