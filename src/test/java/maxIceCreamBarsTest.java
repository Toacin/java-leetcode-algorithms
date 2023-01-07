import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class maxIceCreamBarsTest {

    @Test
    void maxIceCream() {
        int[] costs = {1,3,2,4,1};

        assertEquals(4, maxIceCreamBars.maxIceCream(costs, 7));
    }

    @Test
    void sortArray() {
        List<Integer> unsortedList1 = new ArrayList<>();
        unsortedList1.add(1);
        unsortedList1.add(5);
        unsortedList1.add(3);
        unsortedList1.add(10);
        unsortedList1.add(6);

        List<Integer> sortedList1 = new ArrayList<>();
        sortedList1.add(1);
        sortedList1.add(3);
        sortedList1.add(5);
        sortedList1.add(6);
        sortedList1.add(10);

        assertEquals(sortedList1.toString(), maxIceCreamBars.sortArray(unsortedList1).toString());
//        int[] costs = {1,3,2,4,1};
//        int[] sortedCosts = {1, 1, 2, 3, 4};
//
//        assertEquals(Arrays.toString(sortedCosts), Arrays.toString(maxIceCreamBars.sortArray(costs)));
    }
}