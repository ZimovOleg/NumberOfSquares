package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'checking inside range limit', 200, 300, 3",
            "'checking lower range limit', 200, 200, 0",
            "'checking under lower range limit', 100, 200, 5",
            "'checking upper range limit', 300, 300, 0",
            "'checking all limit', 100, 10_000, 90"
    })
    void shoildNumberOfSquares(String test, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.NumberOfSquares(min, max);
        assertEquals(expected, actual);
    }
}