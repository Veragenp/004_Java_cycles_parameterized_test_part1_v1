package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'number on lower bound',100,110,1",
            "'number on upper bound',9604,9605,1", "'number below lower bound',81,83,0", "'number above upper bound',10001,10005,0","'number in range',200,300,3"})
    void shouldCalculate(String testName, int lowerBound, int upperBound, int expected) {
        SQRService service = new SQRService();
        long actual = service.countsSQR(lowerBound, upperBound);

        assertEquals(expected, actual);

    }
}