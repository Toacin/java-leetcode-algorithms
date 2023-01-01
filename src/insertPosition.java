public class insertPosition {

    static public int searchInsert(int[] nums, int target) {
//        O(log n)
        int midpoint;
        int highestIndex = nums.length -1;
        int lowestIndex = 0;

        while (lowestIndex<=highestIndex) {
            midpoint = (lowestIndex + highestIndex)/2;
            if (nums[midpoint] == target) return midpoint;
            else if (nums[midpoint] > target) highestIndex = midpoint-1;
            else lowestIndex=midpoint+1;
        }
        return lowestIndex;

//        O(n)
//        for (int i=0; i<nums.length; i++) {
//            if (nums[i] >= target) {
//                return i;
//            }
//        }
//        return nums.length;
    }

    static public void main(String[] args) {
        int[] test1 = {0, 1, 2, 3};
        int[] test2 = {3, 4, 7, 25, 88, 90};
        int[] test3 = {0, 1, 2, 3, 5};
        int[] test4 = {3, 4, 5, 7, 25, 88, 90};

        System.out.println(searchInsert(test4, 5));
    }
}
