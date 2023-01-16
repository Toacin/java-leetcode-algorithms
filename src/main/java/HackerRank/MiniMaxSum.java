package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void minMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int minNumber = 0;
        int maxNumber = 0;
        for (int i=0; i<4; i++) {
            minNumber += arr.get(i);
            maxNumber += arr.get(5-i-1);
        }
        System.out.println(minNumber + " " + maxNumber);
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(1);
        testList.add(3);
        testList.add(2);
        testList.add(0);
        minMaxSum(testList);
    }
}
