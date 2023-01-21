package LeetCode.Medium;

public class maxSub {
    public int maxSubArray(int[] nums) {
        if (nums.length==1) return nums[0];
        int minIndex = 0;
        int maxIndex = 0;
        int greatestSum = nums[0];

        for (int i=0; i<nums.length; i++) {
            if (i==nums.length-1 && nums[i]>greatestSum) {
                greatestSum = nums[i];
                continue;
            }
            for (int j=i+1; j<nums.length; j++) {
                int runningSum = 0;
                for (int k=i; k<j; k++) {
                    runningSum += nums[k];
                }
                if (runningSum>greatestSum) {
                    minIndex = i;
                    maxIndex = j;
                    greatestSum = runningSum;
                }
            }
        }

        return greatestSum;
    }
}
