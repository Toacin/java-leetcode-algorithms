package LeetCode.Easy2;

public class guessNum {
    public int pick = 23;

    public int guess(int num) {
        if (num>pick) return -1;
        else if (num<pick) return 1;
        else return 0;
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low<=high) {
            int midpoint = low + (high-low)/2;
            if (guess(midpoint)==1) {
                low=midpoint+1;
            } else if (guess(midpoint)==-1) {
                high=midpoint-1;
            } else {
                return midpoint;
            }
        }

        return low;
    }
}
