package HackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class newYearsChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int totalBribes = 0;
        boolean bribeOccurred = true;
        while (bribeOccurred) {
            bribeOccurred = false;
            for (int i=0; i<q.size(); i++) {
                List<Integer> sortedQ = new ArrayList<>();
                for (int j=0; j<q.size(); j++) {
                    sortedQ.add(q.get(i));
                }
                sortedQ.sort(Comparator.naturalOrder());

                if (q.toString().equals(sortedQ.toString())) {
                    bribeOccurred = false;
                    break;
                };

                if (q.get(i)>i+1 && !bribeOccurred) {
                    int currentPersonBribe = q.get(i)-(i+1);
//                    if (currentPersonBribe>2) {
//                        System.out.println("Too chaotic");
//                        return;
//                    }
                    totalBribes += currentPersonBribe;
                    q.remove(i);
                    bribeOccurred = true;
                }
            }
        }
        System.out.println(totalBribes);
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(2);
        testList.add(1);
        testList.add(3);
        testList.add(4);

        minimumBribes(testList);
    }
}
