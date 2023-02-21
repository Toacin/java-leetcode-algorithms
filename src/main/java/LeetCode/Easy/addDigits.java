package LeetCode.Easy;

import java.util.HashSet;

public class addDigits {
    public int addDigits(int num) {
        int referenceNum = num;
        while (referenceNum>9) {
            String stringifiedNum = String.valueOf(referenceNum);
            int total = 0;
            for (int i=0; i<stringifiedNum.length(); i++) {
                total += Character.getNumericValue(stringifiedNum.charAt(i));
            }
            referenceNum = total;
        }
        return referenceNum;
    }
}
