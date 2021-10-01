package day58_Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order
        hashMap.put(null, null);

        Map<String, Integer> linkedHashMap = new HashMap<>();  // insertion order
        hashMap.put(null, null);

        Map<String, Integer> treeMap = new TreeMap <>(); //sorted order
        hashMap.put(null, null);

        Map<String, Integer> hashTable = new Hashtable<>(); // tread safe
        hashMap.put(null, null);






    }
}
