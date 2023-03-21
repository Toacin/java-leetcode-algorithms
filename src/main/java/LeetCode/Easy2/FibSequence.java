package LeetCode.Easy2;

import java.util.ArrayList;
import java.util.List;

public class FibSequence {
    public int fib(int n) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);
        arrayList.add(1);

        for (int i=2; i<=n; i++) {
            arrayList.add(arrayList.get(i-1)+arrayList.get(i-2));
        }

        return arrayList.get(n);
    }
}