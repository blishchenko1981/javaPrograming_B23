package day58_Maps;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String word = "aaaaaaaabbbbbbcccdddddd";

        Map<String, Integer>  result = new LinkedHashMap<>();

        for (String each : word.split("")) {

            int freak = Collections.frequency(Arrays.asList(word.split("")), each);
            result.put(each, freak);


        }

        System.out.println("result = " + result);

        ArrayList<Integer> list = new ArrayList<>(result.values());
        Collections.sort(list);

        int second = list.get(list.size()-2);

        System.out.println(second);

        System.out.println("----------------------------------------");

        for (Map.Entry<String, Integer> entry : result.entrySet()) {

            if(entry.getValue() == second){

                System.out.println(entry.getKey());
            }
        }








    }





}
