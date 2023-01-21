package LeetCode.Easy;

public class productOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] returnArray = new int[nums.length];
        int product = 1;
        boolean zeroExists = false;

        for (int num: nums) {
            if (num == 0) {
                if (zeroExists) {
                    return returnArray;
                }
                zeroExists = true;
            } else {
                product *= num;
            }
        }

        for (int i = 0; i<nums.length; i++) {
            if (!zeroExists) {
                returnArray[i] = product/nums[i];
            } else {
                returnArray[i] = (nums[i]==0) ? product : 0;
            }
        }

        return returnArray;
    }
}
