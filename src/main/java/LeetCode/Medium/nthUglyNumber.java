package LeetCode.Medium;

public class nthUglyNumber {
    public int nthUglyNumber(int n) {
        int uglyCount = 0;
        int numToCheck = 2;
        while (uglyCount<n) {
            int numRef = numToCheck;
            boolean ugly = true;

            while (numRef>5) {
                if (numRef%5==0) numRef /= 5;
                else if (numRef%3==0) numRef /= 3;
                else if (numRef%2==0) numRef /= 2;
                else {
                    ugly=false;
                    break;
                }
            }
            if (ugly) uglyCount++;
            numToCheck++;
        }
        return numToCheck-1;
    }
}
