package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeCount {
    public static void plusMinus(List<Integer> arr) {
        double length = arr.size();
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for(Integer number: arr) {
            if (number>0) {
                positiveCount++;
            } else if (number<0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

//        double positiveRatio = Math.round(positiveCount/length*1000000)/1000000.0;
//        double negativeRatio = Math.round(negativeCount/length*1000000)/1000000.0;
//        double zeroRatio = Math.round(zeroCount/length*1000000)/1000000.0;

        double positiveRatio = positiveCount/length;
        double negativeRatio = negativeCount/length;
        double zeroRatio = zeroCount/length;

        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<Integer>();
//        testList.add(0);
//        testList.add(-3);
        testList.add(5);
        testList.add(6);
        testList.add(-4);
        testList.add(0);
        plusMinus(testList);
    }
}
