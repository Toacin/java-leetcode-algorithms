package HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCypherTest {

    @Test
    void caesarCipher() {
        assertEquals("Ifmmp Xpsme", CaesarsCypher.caesarCipher("Hello World", 1));
    }
}