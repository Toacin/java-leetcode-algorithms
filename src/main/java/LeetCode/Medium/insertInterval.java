package LeetCode.Medium;

public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] returnArray = new int[intervals.length+1][2];
        for (int i=0; i<intervals.length; i++) {
            if (intervals[i][1]<newInterval[i]) continue;
        }

        return returnArray;
    }
}
