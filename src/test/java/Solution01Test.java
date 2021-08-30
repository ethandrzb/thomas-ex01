import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution01Test {

    @Test
    void greet()
    {
        Assertions.assertEquals("Hello, Ethan, nice to meet you!", Solution01.greet("Ethan"));
    }
}