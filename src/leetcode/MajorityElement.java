package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,4,4,5,5,5,5,5};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        int num = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for (int i:nums){
            if (count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }else count.put(i,1);
        }
        int high = 0;
        for (Map.Entry<Integer,Integer> set : count.entrySet()) {
            if (set.getValue()>num){
                high=set.getKey();
                num = set.getValue();
            }
        }
        return high;
    }
}
