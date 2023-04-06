package ru.netology.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatServiceTest {

  @Test
  void calculateMaxMonth() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxMonth(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateMinMonth() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonth(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateCounterUnderAverage() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateCounterUnderAverage(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateCounterUpperAverage() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateCounterUpperAverage(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void calculateAverageSum() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = (int) service.calculateAverageSum(purchases);
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchases);
        assertEquals(actual, expected);
    }
}
