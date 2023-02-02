package LeetCode.Easy;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length-1;

        while (lowIndex<=highIndex) {
            int midpoint = (lowIndex+highIndex)/2;
            if (target<nums[midpoint]) highIndex = midpoint-1;
            else if (target>nums[midpoint]) lowIndex = midpoint+1;
            else return midpoint;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test = {-1,0,3,5,9,12};
        System.out.println(search(test, 9));
    }
}
