package HackerRank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class countingSortTest {

    @Test
    void flippingMatrix() {
        List<Integer> testArrayRow1 = new ArrayList<Integer>();
        List<Integer> testArrayRow2 = new ArrayList<Integer>();
        List<Integer> testArrayRow3 = new ArrayList<Integer>();
        List<Integer> testArrayRow4 = new ArrayList<Integer>();
        for (int i = 1; i<=4; i++) {
            testArrayRow1.add(i);
            testArrayRow2.add(i+4);
            testArrayRow3.add(i+8);
            testArrayRow4.add(i+12);
        }
        List<List<Integer>> testMatrix = new ArrayList<>();
        testMatrix.add(testArrayRow1);
        testMatrix.add(testArrayRow2);
        testMatrix.add(testArrayRow3);
        testMatrix.add(testArrayRow4);

        assertEquals(54, countingSort.flippingMatrix(testMatrix));
    }
}