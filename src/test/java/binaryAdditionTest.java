import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binaryAdditionTest {

    @Test
    void addBinary() {
        assertEquals("1101", binaryAddition.addBinary("1010", "0011"));
        assertEquals("110001010", binaryAddition.addBinary("10011010", "11110000"));
    }
}