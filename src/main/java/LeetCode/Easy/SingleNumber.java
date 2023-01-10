package LeetCode.Easy;

import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numberFrequency = new HashMap<Integer, Integer>();
        for (int number: nums) {
            if (numberFrequency.get(number) == null) numberFrequency.put(number, 1);
            else numberFrequency.remove(number);
        }
        for (int number: numberFrequency.keySet()) {
            return number;
        }
        return 0;
    }
}
