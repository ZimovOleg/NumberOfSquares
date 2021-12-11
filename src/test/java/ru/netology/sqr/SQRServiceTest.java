package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"checking inside range limit, 200, 300, 3",
            "checking under lower range limit, 100, 100, 1",
            "checking upper range limit, 300, 300, 0",
            "checking over upper range limit, 400, 400, 1",
            "checking all number limit, 100, 9801, 90"})
    void calculate(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }
}