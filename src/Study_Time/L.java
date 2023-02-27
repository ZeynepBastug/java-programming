package Study_Time;


import java.util.*;

public class L{
    public String name;

}


 class Java extends L {
     public double radius;
}


class Main {
    public static void main(String[] args) {
      Map<Integer, String> m = new HashMap<>();
      m.put(1,"a");
      m.put(2,"b");
      m.put(3,"c");
      m.put(4,"d");
        for (Integer k: m.keySet()) {
            System.out.println(m.get(k));
        }

    }
}



