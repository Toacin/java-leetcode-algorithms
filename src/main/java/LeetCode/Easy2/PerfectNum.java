package LeetCode.Easy2;

import java.util.ArrayList;
import java.util.List;

public class PerfectNum {
    public static boolean checkPerfectNumber(int num) {
        if (num==1) return false;
        List<Integer> factorList = new ArrayList<>();
        factorList.add(1);
        int highInt = 100000000;

        for (int i=2; i<=num/2; i++) {
            if (i==highInt) break;
            if (num%i==0) {
                highInt = (num/i);
                factorList.add(i);
                factorList.add(highInt);
            }
        }

        System.out.println(factorList.toString());

        int sum = 0;
        for (int factor : factorList) {
            sum+=factor;
        }

        return (sum==num);
    }

    public static int multByAdd(int m, int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return m;
        } else {
            return m + multByAdd(m, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
