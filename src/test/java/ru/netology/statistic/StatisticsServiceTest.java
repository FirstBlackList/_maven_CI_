package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    StatisticsService service = new StatisticsService();

    @Test
    void findMax() {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        assertEquals(expected, service.findMax(incomesInBillions));
    }

    @Test
    void findMaxTwo() {
        long[] incomesInBillions = {-12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        assertEquals(expected, service.findMax(incomesInBillions));
    }

}
