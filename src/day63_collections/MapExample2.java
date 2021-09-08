package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample2 {
    public static void main(String[] args) {

        // id, Person
        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(12, new Person ("Nick", 10));
        map.put(null, new Person ("", 0));

        System.out.println(map.get(32));

        System.out.println(map);

        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(32, new Person("MJ", 32));
        map2.put(12, new Person ("Nick", 10));
        map2.put(null, new Person ("", 0));

        System.out.println(map2);

        Map<Integer, Person> map3 = new TreeMap<>();
        map3.put(32, new Person("MJ", 32));
        map3.put(12, new Person ("Nick", 10));
        map3.put(null, new Person ("", 0));
    }
}
