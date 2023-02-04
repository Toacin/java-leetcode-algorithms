package LeetCode.Easy;

import java.util.HashSet;

public class SingleNumberHashSet {
    public int singleNumber(int[] nums) {
        HashSet<Integer> numContainer = new HashSet<>();
        for (int num: nums) {
            if (numContainer.contains(num)) {
                numContainer.remove(num);
            } else {
                numContainer.add(num);
            }
        }

        return (int) numContainer.toArray()[0];
    }
}
