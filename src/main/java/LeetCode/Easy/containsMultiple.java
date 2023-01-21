package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class containsMultiple {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return true;
        Arrays.sort(nums);
        int prevNumBegin = nums[0];
        int prevNumEnd = nums[nums.length-1];

        for (int i=1; i<nums.length/2; i++) {
            if (nums[i] == prevNumBegin || nums[nums.length-1-i] == prevNumEnd) return true;
            prevNumBegin = nums[i];
            prevNumEnd = nums[nums.length-1-i];
        }
        return false;
    }
}
