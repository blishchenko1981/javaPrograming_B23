package Day56_Collections;

import java.lang.reflect.Array;
import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,2,3,4,5,6));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.addAll(Arrays.asList(1,2,3,4,5,6,2,3,4,5,6));

        Queue<Integer> q3 = new LinkedList<>();
        q3.addAll(Arrays.asList(1,2,3,4,5,6,2,3,4,5,6));

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        System.out.println(((LinkedList)q3).get(3));

        System.out.println("-------------------------");

        q1.poll();
        System.out.println("q1 after first poll" + q1);        // FIRST IN FIRST OUT  (FIFO)
        q2.poll();
        System.out.println("q2 after first poll" + q2);
        q3.poll();
        System.out.println("q3 after first poll" + q3);



    }
}
