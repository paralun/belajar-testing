package belajar.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatTest {

    @DisplayName("Test Repeat")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRepeat() {
        Assertions.assertEquals(10, 10);
    }
}
