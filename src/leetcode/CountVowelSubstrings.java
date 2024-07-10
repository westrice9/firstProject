package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountVowelSubstrings {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("cuaieuouac"));
    }
    public static int countVowelSubstrings(String word) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < word.length() - 4; i++) {
            Map<Character, Integer> map = new HashMap();
            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);
                if (vowels.indexOf(c) > -1) {
                    map.put(c, i);
                    if (map.size() == 5) {
                        count++;

                    }
                } else {
                    break;
                }

            }
        }
        return count;
    }
}
