import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        int[] test1 = {0, 1, 1, 1, 1, 4};

        assertEquals(1, MajorityElement.majorityElement(test1));
    }
}