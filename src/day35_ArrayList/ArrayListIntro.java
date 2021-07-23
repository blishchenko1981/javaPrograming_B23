package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10); //add to index[0]
        numbers.add(11); //add to index[1]
        numbers.add(12); //add to index[2]
        numbers.add(0, 9);
        System.out.println(numbers);

        System.out.println(numbers.get(2));
        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        numbers.add(2, 20);
        for(Integer each : numbers){
            System.out.println(each);
        }
        System.out.println(numbers);



    }

}
