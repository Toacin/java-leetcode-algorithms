package LeetCode.Easy2;

import java.util.ArrayList;
import java.util.List;

public class FibSequence {
    public int fib(int n) {
        List<Integer> sequenceArr = new ArrayList<>();

        sequenceArr.add(0);
        sequenceArr.add(1);

        for (int i=2; i <= n; i++) {
            int prevPrevNumber = sequenceArr.get(i-2);
            int previousNumber = sequenceArr.get(i-1);
            sequenceArr.add(previousNumber+prevPrevNumber);
        }

        return sequenceArr.get(n);
    }
}