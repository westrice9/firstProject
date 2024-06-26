package collections;

import java.util.Map;
import java.util.TreeMap;

public class IntroTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(6,"Theresa");
        map.put(5,"Jack");
        map.put(2,"Jenny");
        map.put(4,"Brad");

        System.out.println(map);
    }
}
