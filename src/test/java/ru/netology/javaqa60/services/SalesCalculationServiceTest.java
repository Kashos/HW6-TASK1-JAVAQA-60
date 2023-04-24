package ru.netology.javaqa60.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SalesCalculationServiceTest {

    @Test
    void shouldCalculateSalesAmount() {

        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int salesAmount = service.getSalesAmount(sales);

        Assertions.assertEquals(expected, salesAmount);
    }

    @Test
    void shouldCalculateAverageSalesAmount() {

        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int averageSales = service.getAverageSum(sales);

        Assertions.assertEquals(expected, averageSales);
    }

    @Test
    void shouldCalculateMaxMonthSales() {
        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int maxMonth = service.getMaxSales(sales);

        Assertions.assertEquals(expected, maxMonth);
    }

    @Test
    void shouldCalculateMinMonthSales() {
        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int minMonth = service.getMinSales(sales);

        Assertions.assertEquals(expected, minMonth);
    }

    @Test
    void shouldCalculateBelowAverageSales() {
        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 11;

        int minAverageMonth = service.getBelowAverageSales(sales);

        Assertions.assertEquals(expected, minAverageMonth);
    }

    @Test
    void shouldCalculateAboveAverageSales() {
        SalesCalculationService service = new SalesCalculationService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 12;

        int maxAverageMonth = service.getAboveAverageSales(sales);

        Assertions.assertEquals(expected, maxAverageMonth);
    }
}
