package LeetCode.Easy;

import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> setOfNumsVis = new HashSet<>();
        setOfNumsVis.add(n);
        int currNum = n;
        while (true) {
            if (currNum == 1) return true;

            String numAsString = String.valueOf(currNum);
            int newNum = 0;
            for (int i=0; i<numAsString.length(); i++) {
                newNum += Math.pow(Integer.parseInt(String.valueOf(numAsString.charAt(i))), 2);
            }

            if (setOfNumsVis.contains(newNum)) {
                return false;
            } else {
                setOfNumsVis.add(newNum);
                currNum = newNum;
            }
        }
    }
}
