package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {

        /** MAP
         * it's an Interface that works in key/value format
         * in maps every key/value pair is called entry. A key is linked to a value
         *    -> Keys are unique
         *    -> Values can be duplicate
         *
         *    Map<keyDataType, valueDataType> refName = obj
         * HasMap: implements Map. Based on an algorithm that is fast and efficient to find elements.
         * The order of entries is not guaranteed. Allow one null key
         *
         * - Common methods:
         *     map.put(key, value)
         *     map.get(key)
         *     map.remove(key)
         *     map.containsKey(key)
         *     map.containsValue(value)
         *     map.size()
         *     map.keySet()
         *
         * LinkedHashMap : still key/value format. Maintain insertion order of entries
         *
         * treeMap:
         */

        // id, names
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(4, "Hazel");

        System.out.println(map);

        map.remove(1);
        System.out.println(map);

        map.put(1,"Kinga");
        System.out.println(map);

        System.out.println(map.get(4));

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Hazel"));

        for (Integer key : map.keySet()) {

            System.out.println(key + " - " + map.get(key));

            if(map.get(key).equals("Daria")){
                System.out.println("this is our key " + key);
            }

        }




    }

}
