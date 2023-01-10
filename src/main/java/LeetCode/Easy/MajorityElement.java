package LeetCode.Easy;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (frequencyMap.get(num) == null) {
                frequencyMap.put(num, 1);
            } else {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            }
            if (frequencyMap.get(num)>nums.length/2) return num;
        }
        return 0;
    }
}
