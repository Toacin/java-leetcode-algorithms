public class ThreeSumClose {
    public int threeSumClosest(int[] nums, int target) {
        int finalSum = -1;
        int smallestGap=10001;

        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length; j++) {
                if (i==j) continue;
                for (int k=0; k<nums.length; k++) {
                    if (i==k || j==k) continue;
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum-target)<smallestGap) {
                        smallestGap = Math.abs(sum-target);
                        finalSum = sum;
                    }
                }
            }
        }

        return finalSum;
    }
}
