package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        int i = names.length - 1;
        for (String n : map.values()) {
            names[i] = n;
            i--;
        }
        return names;
    }
}
