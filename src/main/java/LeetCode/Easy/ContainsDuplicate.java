package LeetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> indicesOfNums = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (indicesOfNums.get(nums[i]) == null) {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                indicesOfNums.put(nums[i], newList);
            } else {
                List<Integer> existingList = indicesOfNums.get(nums[i]);
                existingList.add(i);
                indicesOfNums.put(nums[i], existingList);
            }
        }

        for (Integer num : indicesOfNums.keySet()) {
            List<Integer> currentList = indicesOfNums.get(num);

            Collections.sort(currentList);

            for (int i=0; i<currentList.size()-1; i++) {
                if ((currentList.get(i+1)-currentList.get(i))<=k) return true;
            }
        }

        return false;
    }
}
