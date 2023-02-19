package LeetCode.Easy;

public class UglyNumber {
    public boolean isUgly(int n) {
        int numRef = n;
        if (numRef<=0) return false;

        while (numRef>5) {
            if (numRef%5==0) numRef /= 5;
            else if (numRef%3==0) numRef /= 3;
            else if (numRef%2==0) numRef /= 2;
            else return false;
        }

        return true;
    }
}
