package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, -5, -3, -2};
        long expected = -1;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithDuplicates() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 7, 8, 8, 9, 9, 9};
        long expected = 9;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSortedArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
