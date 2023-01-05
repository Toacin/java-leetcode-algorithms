import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        int[] test1 = {0, 0, 1, 1, 2, 2, 4, 4, 5, 5, 6};
        int[] test2 = {0, 0, 4, 5, 6, 3, 5, 6, 4};

        assertEquals(6, SingleNumber.singleNumber(test1));
        assertEquals(3, SingleNumber.singleNumber(test2));
    }
}