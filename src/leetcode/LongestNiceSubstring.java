package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {

    }
    public static String longestNiceSubstring(String s) {
    Set<Character> set = new HashSet<>();
    for (int i = 0;i<s.length();i++)set.add(s.charAt(i));

    for (int i = 0;i<s.length();i++) {
        if (set.contains(Character.toUpperCase(s.charAt(i)))
        && set.contains(Character.toLowerCase(s.charAt(i)))) continue;

        String s1 = longestNiceSubstring(s.substring(0,i));
        String s2 = longestNiceSubstring(s.substring(i+1));
        return s1.length() >= s2.length() ? s1 : s2;
    }
    return s;
    }
}
