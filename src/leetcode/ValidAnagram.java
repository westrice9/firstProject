package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("aacc","ccac"));
    }
    public static boolean isAnagram(String s, String t) {
//        char[] string1 = s.toCharArray();
//        char[] string2 = t.toCharArray();
//        Arrays.sort(string1);
//        Arrays.sort(string2);
//
//        return Arrays.equals(string1,string2);
        if (s.length() != t.length()) return false;
        // if length is != then its not an anagram
        Map<Character, Integer> map = new HashMap<>();
        // fill up letters from s into map
//        for (int i =0;i<s.length();i++){
//            char letter = s.charAt(i);
//            if (map.containsKey(letter)){
//                map.put(letter,map.get(letter)+1);
//            } else map.put(letter,1);
//        }
//        // check if letter in t is in map
//        for (int i = 0;i<s.length();i++) {
//            char letter = s.charAt(i);
//            if (!map.containsKey(letter)) return false;
//            else {
//                if (map.get(letter) == 0) return false;
//                map.put(letter, map.get(letter) - 1);
//            }
//        }
//        return true;
        for (int i = 0, a = 0; i < s.length() * 2; i++) {
            if (i<s.length()) {
                char letter1 = s.charAt(i);
                if (map.containsKey(letter1)) {
                    map.put(letter1, map.get(letter1) + 1);
                } else map.put(letter1, 1);
            }
            if (i >= s.length()) {
                char letter2 = t.charAt(a);
                if (!map.containsKey(letter2)) return false;
                else {
                    if (map.get(letter2) == 0) return false;
                    map.put(letter2, map.get(letter2) - 1);
                }
                a++;
            }
        }
        return true;
    }
}
