package LeetCode.Easy;

import java.util.*;

public class intersectionOfArray2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums1Map = new HashMap<>();
        HashMap<Integer, Integer> finalHashMap = new HashMap<>();

        for (int num : nums1) {
            if (nums1Map.get(num) == null) nums1Map.put(num, 1);
            else nums1Map.put(num, nums1Map.get(num) + 1);
        }

        for (int num : nums2) {
            if (nums1Map.get(num) != null && nums1Map.get(num) > 0) {
                if (finalHashMap.get(num) == null) finalHashMap.put(num, 1);
                else finalHashMap.put(num, finalHashMap.get(num)+1);
                nums1Map.put(num, nums1Map.get(num)-1);
            }
        }

        int sizeOfArray = 0;
        for (int num : finalHashMap.keySet()) {
            sizeOfArray += finalHashMap.get(num);
        }

        int[] returnArr = new int[sizeOfArray];

        int index = 0;
        for (int num : finalHashMap.keySet()) {
            for (int i=0; i<finalHashMap.get(num); i++) {
                returnArr[index++] = num;
            }
        }

        return returnArr;
    }
}
